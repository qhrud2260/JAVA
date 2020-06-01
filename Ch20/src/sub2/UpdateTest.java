package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2020/05/26
 * 이름 : 김보경
 * 내용 : JDBC Update 실습하기
 */

public class UpdateTest {

	public static void main(String[] args) throws Exception{
		//DB정보
		String host = "jdbc:mysql://192.168.44.7/kbk";
		String user = "kbk";
		String pass = "1234";
		
		Connection conn = null;
		
		try {
			//1단계 - JDBC 드라이버 동적로드
			Class.forName("com.mysql.jdbc.Driver");
			
			//2단계 - 데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass);
			
			//3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			//4단계 - SQL 실행		
			String sql = "UPDATE `USER1` SET `hp` = '010-4444-1111' ";
				   sql += "WHERE `uid` = 'J101'";
			stmt.executeUpdate(sql);
			//5단계 - 결과셋(ResultSet) 처리(SELECT일 경우)
			//6단계 - 데이터베이스 종료(해제)
			conn.close();
		}catch (SQLException e) {
			System.out.println("퀴리문 실행에 문제가 발생했습니다.");
		}
		System.out.println("UPDATE 완료...");
				
	}

}
