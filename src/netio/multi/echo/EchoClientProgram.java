package netio.multi.echo;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class EchoClientProgram {

	public static void main(String[] args) {


		
		Socket socket;
		try {
			socket = new Socket("211.238.142.157",10000);
			System.out.println("connected to" + socket.getRemoteSocketAddress());
			

			OutputStream nos = socket.getOutputStream();
			InputStream nis = socket.getInputStream();
			
			
			PrintStream nout = new PrintStream(nos,true);
			Scanner nscan  =  new Scanner(nis);
			Scanner scan  =  new Scanner(System.in);
			String msg;
			
			do{
				
				msg =  scan.nextLine();
				nout.println(msg);
				
				String echo  = nscan.nextLine();
				System.out.println("echo = "+echo);
				
			}while(!msg.equals("bye"));
			
			
			nout.close();
			nscan.close();
			
			nis.close();
			nos.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
