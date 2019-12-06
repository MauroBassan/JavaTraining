package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestAccessoDbDaTastiera {

	public static void main(String[] args) {

		Connection conn= null;
		Statement stmt;
		ResultSet rs;
		String utente;
		String pwd = null;
		int conta=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("***Accesso al database Stark Enterprise!***");

		do{
			System.out.println(">>> prego inserire il nome utente:");

			utente=sc.nextLine(); 
			if(utente.equalsIgnoreCase("exit")) {
				System.out.println(" Disconnesso dai sistemi STARK!");
				break;}

			System.out.println(">>>prego inserire la password:");
			pwd = sc.nextLine();

			if (utente.equals("root") && pwd.equals("admin")) {
				System.out.println("Accesso avvenuto al db STARK!");
			}
			else if(!(utente.equals("root") || (pwd.equals("admin")))) {
				System.out.println("Siete pregati di controllare le vostre credenziali.\n STARK DB.");
				conta++;}

			if (conta>1) { 
				System.out.println("ACCESSO NEGATO!");
				System.exit(0);
			}

		}while (!(utente.equals("root") || (pwd.equals("admin"))));

		try {
			//carica in memoria questo driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC", utente, pwd);
			System.out.println("*** DB CONNESSO CORRETTAMENTE ***");
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
			System.out.println("si è verificato un errore durante la connessione al db: " + e.getMessage());
		} finally {
			try {
				if (conn != null) conn.close();
			} catch (SQLException e) {
				System.out.println("si è verificato un errore durante la chiusra della connessione");
			}
		}
	}
}