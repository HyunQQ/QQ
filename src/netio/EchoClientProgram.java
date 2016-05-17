package netio;


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

		//System.out.println("connected to" + socket.getRemoteSocketAddress());
		//Socket socket = new Socket("211.238.142.101",10000);
		
	/*	///////jdk 6����

		Socket socket  = null;
		  ///// �ڿ� ������ �����ؼ� finally�� �ذ��� ��ߵȴ�.
		try {
			socket = new Socket("211.238.142.107",10000);
			socket.setSoTimeout(15000);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(socket != null){
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
*/
		
			////// jdk 7 �̻� ///////////
/*		/// �ڿ� ������ �˾Ƽ� 
		try(Socket socket = new Socket("211.238.142.107",10000)){  
			socket.setSoTimeout(15000);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�������");
		}
		
*/	
		/////////////////////////////////////
/*		
		try(Socket socket = new Socket("211.238.142.107",10000)){  
			socket.setSoTimeout(15000);

			InputStream nin = socket.getInputStream();
			OutputStream nout = socket.getOutputStream();
			nout.write('n');  // 1byte�� �����Ҽ� �ִ°Ŵ�.
			nout.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�������");
		}*/
	
		
		///////////////////////////////////////////////////////////////////
		
	/*	while(true){
		try(Socket socket = new Socket("211.238.142.157",10000)){  
			socket.setSoTimeout(15000);

			InputStream nin = socket.getInputStream();
			OutputStream nout = socket.getOutputStream();
	
			InputStream fin = new FileInputStream("C:\\Users\\SIST\\Desktop\\heliproject\\missile.png");
			
			for(int c = fin.read() ; c!=-1 ; c= fin.read())
				nout.write(c);
			
			nout.flush();
			
			fin.close();
			nout.close();
			nin.close();
			socket.close();
			System.out.println("���ۿϷ�");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�������");
		}
		}*////////////////////////////////////////
		/*
		Socket socket;
		try {
			socket = new Socket("211.238.142.107",10000);
			System.out.println("connected to" + socket.getRemoteSocketAddress());
			

			OutputStream nos = socket.getOutputStream();
			InputStream nis = socket.getInputStream();
			
			
			PrintStream nout = new PrintStream(nos,true);
			Scanner nscan  =  new Scanner(nis);
			
			nout.println("hello hello");
			
			String msg  = nscan.nextLine();
			System.out.println(msg);
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
*/
////////////////////////////////////////////////////
		
		Socket socket;
		try {
			socket = new Socket("211.238.142.107",10000);
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
