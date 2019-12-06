package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestConnessioneDB {

	public static void main(String[] args) {
		
		//connessione al db
		Scanner sc = new Scanner(System.in);
		System.out.println("di quale stato vuoi vedere le informazioni?");
		String scelta  = sc.nextLine();
		String driver = "com.mysql.cj.jdbc.Driver";
		String usr = "root";
		String pwd = "admin";
		String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
		ResultSet rs;
		
		Connection conn = ConnessioneDB.openConnect(driver, url, usr, pwd);
		if ( conn != null) {
			try {
//				Statement stmt = conn.createStatement();
//				
//				boolean b = false;
//				String sql;
//				
//				if(!b) {
//					sql= "select * from offices";
//				} else {
//					sql= "select * from offices where country = 'USA'";
//				}
//				// nel resultset metto il risultato della query
//				rs = stmt.executeQuery(sql);
//				
//				while (rs.next() ) {
//					System.out.println("office code: " + rs.getString("officeCode"));
//				} 
				
				// si usa quando si ha una query da parametrizzare
				PreparedStatement ps;
				ps = conn.prepareStatement("select * from offices where country = ?");
				// al ? numero 1 valorizzo con USA nella mia prepared statement
				ps.setString(1, scelta);
				rs = ps.executeQuery();
				
				int conta = 0;
				while (rs.next() ) {
					conta ++;
					System.out.println(rs.getString("country"));
				}	
				
				if(conta == 0) System.out.println("non c'è niente da leggere/scrivere!");
				
			} catch (SQLException e1) {
				System.out.println(" si è verificato un errore durante la creazione" + 
			" di uno statement SQL: " + e1.getMessage());
			}

			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println(" si è verificato un errore durante la chiusura"+
			"della connessione al db!" + e.getMessage());
			}
		} else {
			System.out.println("connessione non avvenuta!");
		}
	}
}
