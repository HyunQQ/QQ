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
		
	/*	///////jdk 6이하

		Socket socket  = null;
		  ///// 자원 해제와 관련해서 finally로 해결해 줘야된다.
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
		
			////// jdk 7 이상 ///////////
/*		/// 자원 해제를 알아서 
		try(Socket socket = new Socket("211.238.142.107",10000)){  
			socket.setSoTimeout(15000);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결오류");
		}
		
*/	
		/////////////////////////////////////
/*		
		try(Socket socket = new Socket("211.238.142.107",10000)){  
			socket.setSoTimeout(15000);

			InputStream nin = socket.getInputStream();
			OutputStream nout = socket.getOutputStream();
			nout.write('n');  // 1byte만 전송할수 있는거다.
			nout.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결오류");
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
			System.out.println("전송완료");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결오류");
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
