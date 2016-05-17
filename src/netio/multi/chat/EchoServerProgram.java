package netio.multi.chat;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class EchoServerProgram {

	public static void main(String[] args) throws IOException {
		// ������ ����(���� ip)
		List<PrintStream> nouts = new ArrayList<>();
		ServerSocket svrsocket = new ServerSocket(10000);
		
		ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

		System.out.println("Listenning");
		boolean isRun = true;
		while (isRun) {
			Socket socket = svrsocket.accept();
			/// accep
			System.out.println("connected from " + socket.getRemoteSocketAddress());
			new Thread(new Runnable() {
				@Override
				public void run() {
					OutputStream nos;
					try {
						nos = socket.getOutputStream();
						InputStream nis = socket.getInputStream();

						PrintStream nout = new PrintStream(nos, true);
						readWriteLock.writeLock().lock();
						nouts.add(nout);
						readWriteLock.writeLock().unlock();

						Scanner nscan = new Scanner(nis);

						String msg;
						do {
							msg = nscan.nextLine();
							/*
							 * System.out.println(msg); nout.println(
							 * "This is Echooooo~~:" + msg);// 1�� ���� ����
							 * 
							 */

							 System.out.println(msg);
							
							readWriteLock.readLock().lock();
							for (int i = 0; i < nouts.size(); i++){
								nouts.get(i).println("Echo:" + msg);
								}
							readWriteLock.readLock().unlock();

						} while (!msg.equals("bye"));

						nout.close();
						nscan.close();
						nis.close();
						nos.close();
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}).start();
		}
	}
}
