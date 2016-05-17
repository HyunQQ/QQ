package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// Class.forName("oracle.jdbc.OracleDriver")//// 최신 버전은 자동으로 지원된다.

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl"; /// 1521은
																	/// 오라클 포트번호
		String sql = "SELECT* FROM MEMBER WHERE MID LIKE ' 나정%'";  //  sql 문  어떻게 보여줄지에 대한 조건은 여기서!!!!

		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql); // 그릇을 갖고 있다.

		while (rs.next()) { // 서버에서 레코드 하나를 가져온ㄷ거다.  // 여기는 그냥 간단한 출력만!!
			String mid = rs.getString("MID");
			System.out.println(mid);
		}  /// 자바에서는 데이터 조작을 하면 안된다.
	}

}
