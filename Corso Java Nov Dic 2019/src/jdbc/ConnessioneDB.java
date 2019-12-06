package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDB {

	static public Connection openConnect(String driver, String url, String usr, String pwd) {
		Connection connection = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, usr, pwd);
			System.out.println("*** CONNESSIONE AL DB AVVENUTA CORRETTAMENTE ***");
		} catch (ClassNotFoundException e) {
			System.out.println("errore durante caricamento driver lettura db:" + e.getMessage());
		} catch (SQLException e1) {
			System.out.println("errore durante apertura connessione al db:" + e1.getMessage());
		} finally {
			return connection;
	} 
}}


