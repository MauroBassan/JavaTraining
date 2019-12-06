package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TestCommitRollback {

	public static void main(String[] args) throws SQLException {
		final String driver =  "com.mysql.cj.jdbc.Driver";
		final String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
		final String userdb = "root";
		final String pwd = "admin";
		
		Connection conn;
		String sql;
		PreparedStatement pstmt;
		ResultSet rs;
		Users user;
		
		conn = ConnessioneDB.openConnect(driver, url, userdb, pwd);
		conn.setAutoCommit(false);
		if(conn != null) {
			sql= "Insert into users(id, name, address, email, phone) values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 35);
			pstmt.setString(2, "pippo");
			pstmt.setString(3, "Desio");
			pstmt.setString(4, "hajah@gg.com");
			pstmt.setString(5, "3767567567");
			pstmt.executeUpdate();
			System.out.println("*** inserimento avvenuto correttamente ***");
			conn.commit();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 36);
			pstmt.setString(2, "danilo");
			pstmt.setString(3, "Desio");
			pstmt.setString(4, "gfdgfd@gg.com");
			pstmt.setString(5, "56867867867");
			pstmt.executeUpdate();
			System.out.println("*** inserimento avvenuto correttamente ***");
			conn.rollback();
			
			pstmt.close();
			conn.close();

	}
}
}
