package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2020/05/26
 * �̸� : �躸��
 * ���� : JDBC Delete �ǽ��ϱ�
 */

public class DeleteTest {

	public static void main(String[] args) throws Exception{

		//DB����
		String host = "jdbc:mysql://192.168.44.7/kbk";
		String user = "kbk";
		String pass = "1234";
		
		Connection conn = null;
		//1�ܰ� - JDBC ����̹� �����ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ� - �����ͺ��̽� ����
		conn = DriverManager.getConnection(host, user, pass);
		
		//3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		//4�ܰ� - SQL ����
		String sql = "DELETE FROM `USER1` WHERE `uid` = 'J101' ";
		stmt.executeUpdate(sql);
		//5�ܰ� - �����(ResultSet) ó��(SELECT�� ���)
		
		//6�ܰ� - �����ͺ��̽� ����(����)
		conn.close();
		System.out.println("DELETE �Ϸ�...");
	}

}
