package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws Exception {

		Scanner scan =  new Scanner(System.in);
		System.out.println("��ȸ�� �˻� ���α׷���");
		System.out.println("�̸� �˻��� �Է�:");
		String x = scan.nextLine()+"%'";
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl"; /// 1521��
		/// ����Ŭ ��Ʈ��ȣ
		String sql = "SELECT MID, NAME, AGE FROM MEMBER WHERE NAME LIKE '%"/*+x+"%'"*/;  //  sql ��  ��� ���������� ���� ������ ���⼭!!!!

		//String sql = osql.concat(x);
		 /// concat ����Ҷ��� ���� �����ؼ� ���ų� �ٷ� ����ؾߵȴ�. �ٷ� �� ���� ��ü�� ����Ǵ� ���� �ƴϴ�. 
		
		 	Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql.concat(x)); // �׸��� ���� �ִ�.
				
			System.out.println("���̵�\t\t\t�̸�\t\t\t����");
			
		while (rs.next()) { // �������� ���ڵ� �ϳ��� �����¤��Ŵ�.  // ����� �׳� ������ ��¸�!!
			String mid = rs.getString("MID");
			String name = rs.getString("NAME");
			String age = rs.getString("AGE");
			
			System.out.println(mid+"\t\t\t"+name+"\t\t\t"+age);
		
		}  /// �ڹٿ����� ������ ������ �ϸ� �ȵȴ�.
	}
}
