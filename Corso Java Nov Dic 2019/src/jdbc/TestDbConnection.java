package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestDbConnection {

	public static void main(String[] args) {
		   	Connection conn= null;
		   	Statement stmt;
		   	ResultSet rs;
		
			try {
				//carica in memoria questo driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC", "root", "admin");
				System.out.println("*** DB CONNESSO CORRETTAMENTE***");
				// ora leggiamo qualcosa nel db
				// creiamo un oggetto di tipo istruzione! uno statement!
				stmt= conn.createStatement();
				rs = stmt.executeQuery("select * from offices");
				
				// il metodo next() ritorna true quando c'è qualcosa da leggere 
				//nella riga successiva, il cursore va a leggere ogni riga successiva.
				// usiamo il while perchè non sappiamo se c'è realmente qualcosa da leggere
				while (rs.next() ) {
					System.out.println("office code: " + rs.getString("officeCode"));
				}
				
			} catch (ClassNotFoundException e) {
				System.out.println("driver connessione al db non trovato: " + e.getMessage());
			}
			  catch (SQLException e) {
				System.out.println("si è verificato un errore durante la connessiona la db: " + e.getMessage());
			} finally {
				try {
					if (conn != null) conn.close();
				} catch (SQLException e) {
					System.out.println("si è verificato un errore durante la chiusra della connessione");
				}
			}
	}

}
