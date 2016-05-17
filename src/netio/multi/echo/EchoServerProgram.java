package netio.multi.echo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServerProgram {

	public static void main(String[] args) throws IOException {
		// 이이피 고정(공인 ip)
		ServerSocket svrsocket = new ServerSocket(10000);
		System.out.println("Listenning");
		boolean isRun =true;
		while (isRun) {
			Socket socket = svrsocket.accept(); 
			/// accep
			System.out.println("connected from " + socket.getRemoteSocketAddress());
			new Thread(new Runnable(){
			@Override
			public void run() {
				OutputStream nos;
				try {
					nos = socket.getOutputStream();
					InputStream nis = socket.getInputStream();

					PrintStream nout = new PrintStream(nos, true);
					Scanner nscan = new Scanner(nis);

					String msg;
					do {
						msg = nscan.nextLine();
						System.out.println(msg);
						nout.println("This is Echooooo~~:" + msg);
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

			}
			).start();
		}
	}
}
