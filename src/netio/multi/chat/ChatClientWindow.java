package netio.multi.chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ChatClientWindow extends JFrame implements Runnable { // J가 붙으면 swing이다. Frame의 자식
	private Socket socket;
	private PrintStream nout;
	private Scanner nscan;
	
	
	/*메뉴 객체의 구조*/
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnTool;
	private JMenuItem miExit;
	private JMenuItem miConnec;
	private JMenuItem miSet;
	
	private JTextArea txtInput;
	private JButton btnSend;
	private JPanel panel;
	private JTextArea txtOutput;
	
	public ChatClientWindow() {
		setSize(500, 700);
		setTitle("hyungyu");

		addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent e) {

			}

			@Override
			public void windowClosed(WindowEvent e) {

			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

			@Override
			public void windowDeactivated(WindowEvent e) {

			}

			@Override
			public void windowDeiconified(WindowEvent e) {

			}

			@Override
			public void windowIconified(WindowEvent e) {

			}

			@Override
			public void windowOpened(WindowEvent e) {

			}
		});
		
		menuBar = new JMenuBar();
		mnFile = new JMenu("FIle");
		mnTool = new JMenu("Tool");
		miExit = new JMenuItem("Exit");
		miConnec = new JMenuItem("Connect");
		miConnec.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					socket = new Socket("211.238.142.157", 10000);
					if(socket.isConnected()){
						JOptionPane.showConfirmDialog(ChatClientWindow.this, "Connected to SIST server");
						txtInput.setEnabled(true);

						OutputStream os = socket.getOutputStream();
						InputStream is = socket.getInputStream();
						
						nout = new PrintStream(os,true);
						nscan =  new Scanner(is);
						
						new Thread(ChatClientWindow.this).start();
						
						
					}
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//txtInput.setEnabled(true);
				//JOptionPane.showConfirmDialog(ChatClientWindow.this, "Hello");
				
			}
		});
		miSet = new JMenuItem("Setting");
		
		mnFile.add(miExit);
		mnTool.add(miConnec);
		mnTool.add(miSet);

		menuBar.add(mnFile);
		menuBar.add(mnTool);
		setJMenuBar(menuBar);
		
		
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		btnSend =new JButton("Send");
		
		
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*txtOutput.append(txtInput.getText()+"\n");
				txtInput.setText("");*/
				String msg =  txtInput.getText();
				nout.println(msg);
				txtInput.setText("");
			}
		});
		
		
		panel.add(btnSend,BorderLayout.LINE_END);  
		txtInput =new JTextArea();
		txtInput.setPreferredSize(new Dimension(100,100));  /// 여기서는 layout
		txtInput.setBorder(BorderFactory.createLineBorder(Color.black));
		txtInput.setEnabled(false);
		panel.add(txtInput,BorderLayout.CENTER);  
		
		this.add(panel,BorderLayout.PAGE_END);
		
		txtOutput = new JTextArea();
		txtOutput.setBorder(BorderFactory.createLineBorder(Color.black));
		txtOutput.setEditable(false);
		//txtOutput.setPreferredSize(new Dimension(100, 100));
		this.add(txtOutput,BorderLayout.CENTER);
		
	}

	/// 네트워크 접속이 이루어지면 시작한다. 
	@Override
	public void run() {
		while(true){
			String msg = nscan.nextLine();
			txtOutput.append(msg+"\n");
			
		}
		
	}
}
