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
		System.out.println("［회원 검색 프로그램］");
		System.out.println("이름 검색어 입력:");
		String x = scan.nextLine()+"%'";
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl"; /// 1521은
		/// 오라클 포트번호
		String sql = "SELECT MID, NAME, AGE FROM MEMBER WHERE NAME LIKE '%"/*+x+"%'"*/;  //  sql 문  어떻게 보여줄지에 대한 조건은 여기서!!!!

		//String sql = osql.concat(x);
		 /// concat 사용할때는 따로 저장해서 쓰거나 바로 사용해야된다. 바로 그 문장 자체에 저장되는 것이 아니다. 
		
		 	Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql.concat(x)); // 그릇을 갖고 있다.
				
			System.out.println("아이디\t\t\t이름\t\t\t나이");
			
		while (rs.next()) { // 서버에서 레코드 하나를 가져온ㄷ거다.  // 여기는 그냥 간단한 출력만!!
			String mid = rs.getString("MID");
			String name = rs.getString("NAME");
			String age = rs.getString("AGE");
			
			System.out.println(mid+"\t\t\t"+name+"\t\t\t"+age);
		
		}  /// 자바에서는 데이터 조작을 하면 안된다.
	}
}
