package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// Class.forName("oracle.jdbc.OracleDriver")//// �ֽ� ������ �ڵ����� �����ȴ�.

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl"; /// 1521��
																	/// ����Ŭ ��Ʈ��ȣ
		String sql = "SELECT* FROM MEMBER WHERE MID LIKE ' ����%'";  //  sql ��  ��� ���������� ���� ������ ���⼭!!!!

		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql); // �׸��� ���� �ִ�.

		while (rs.next()) { // �������� ���ڵ� �ϳ��� �����¤��Ŵ�.  // ����� �׳� ������ ��¸�!!
			String mid = rs.getString("MID");
			System.out.println(mid);
		}  /// �ڹٿ����� ������ ������ �ϸ� �ȵȴ�.
	}

}
