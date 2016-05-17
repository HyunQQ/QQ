package netio;

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
		Socket socket = svrsocket.accept(); /// 다른 놈들을 블로킹해놓는다.
		System.out.println("connected from "+socket.getRemoteSocketAddress());
	///////////////////////////////////////	
	/*	
		InputStream nin = socket.getInputStream();
		//OutputStream nout = socket.getOutputStream();
		
		
		//char c =  nin.read(); ///  없으면 자동으로 blocking을 한다.
		//System.out.println(c);
		
		OutputStream  fout  =  new FileOutputStream("C:\\Users\\SIST\\Desktop\\창고\\work\\work\\fox.ppt");
		
		for(int i = nin.read(); i!=-1;i=nin.read())
			fout.write(i);
		
		fout.flush();
		
		fout.close();
	//	nout.close();
		nin.close();
		socket.close();
		System.out.println("파일 수신 완료");
	*/	////////////////////////////
		/*
		OutputStream nos = socket.getOutputStream();
		InputStream nis = socket.getInputStream();
		
		PrintStream nout = new PrintStream(nos,true);
		Scanner nscan  =  new Scanner(nis);
		
		String msg  = nscan.nextLine();
		System.out.println(msg);
		
		nout.println("echo:" + msg);
		
		nout.close();
		nscan.close();
		
		nis.close();
		nos.close();
		socket.close();
		 출력 결과
		Listenning
		connected from /211.238.142.107:57716
		Hello Network OK 107*/
		
		///////////////////////////////////////////////////////////
		

		OutputStream nos = socket.getOutputStream();
		InputStream nis = socket.getInputStream();
		
		PrintStream nout = new PrintStream(nos,true);
		Scanner nscan  =  new Scanner(nis);
		
		String msg;
		do{
			msg =  nscan.nextLine();
			System.out.println(msg);
			nout.println("This is Echooooo:"+msg);
		}while(!msg.equals("bye"));
		
		nout.close();
		nscan.close();
		
		nis.close();
		nos.close();
		socket.close();
		
	}
}
