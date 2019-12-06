package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class TestCrudDb {
	
	static Connection conn;
	static String sql;
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
		String user = "root";
		String pwd = "admin";
		Scanner sc = new Scanner(System.in);
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url , user, pwd);
			System.out.println("***ACCESSO AL DB AVVENUTO CON SUCCESSO***");
			// Implementazione dei metodi CRUD
			//Inserimento     (C-reate)
//			insertUser(sc);
//			//Lettura         (R-ead)
//			readUser(rs);
//			//Aggiornamento   (U-pdate)
//			updateUser(sc);
			//Cancellazzione  (D-elete)
			deleteUser(sc);
		} catch (ClassNotFoundException e) {
			System.out.println("Si è verificato un problema durante il caricamento in "
					+ " memoria del driver di connessione al DB: " + e.getMessage());
		}catch (SQLException e) {
			System.out.println("Si è verificato un problema durante la connessione al DB: " + e.getMessage());
		}
	}
	private static void deleteUser(Scanner sc)  {
		System.out.println("Inserisci la key che identifica la riga che vuoi eliminare");
		int Key = sc.nextInt(); sc.nextLine();
		sql = "Delete From users Where id = '" + Key +"'";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("**Eliminazione avvenuta con successo**");
		} catch (SQLException e) {
			System.out.println("Si è verificato un problema durante l' eliminazione della riga " + e.getMessage());
		}
	}
	private static void updateUser(Scanner sc) {
System.out.println("Inserire nuovo nome della chiave 2 ");
		sql = "Update users Set name = '" + sc.nextLine() + "' Where id = 2";
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("**Update avvenuto correttamente**");
		} catch (SQLException e) {
			System.out.println("Errore durante l ' update dello statement SQL: " + e.getMessage());
			e.printStackTrace();
		}
	}
	private static void readUser(ResultSet rs) {
		sql= "Select * From users";
		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("**Lettura avvenuta con successo**");
		} catch (SQLException e) {
			System.out.println("Errore durante l esecuzione della query : " + e.getMessage());
		}
		try {
			while(rs.next())
			{
			System.out.println("id : "+ rs.getInt("id") );
			System.out.println("Nome : " + rs.getString("name"));
			System.out.println("Residente a : " + rs.getString("address"));
			System.out.println("email : " + rs.getString("email"));
			System.out.println("numero di telefono : " + rs.getString("phone"));
			}
		} catch (SQLException e) {
			System.out.println("Non è inserito nessun parametro all' interno della tabella : " + e.getMessage());
			e.printStackTrace();
		}
	}
	private static void insertUser( Scanner sc) {
		Users user  = new Users();
		System.out.println("Inserire il valore della chiave per il nuovo utente ");
		user.setId(sc.nextInt());
		System.out.println("Inserire nome");
		user.setNome(sc.nextLine());
		System.out.println(" Inserire luogo della risiedenza ");
		user.setAddress(sc.nextLine());
		System.out.println("Inserire email");
		user.setEmail(sc.nextLine());
		System.out.println("Inserire numero di telefono");
		user.setPhone(sc.nextLine());
		sql = "Insert into users (id, name, address, email, phone)"
				+ "values (?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getNome());
			pstmt.setString(3, user.getAddress());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPhone());
			pstmt.executeUpdate();
			System.out.println("**Inserimento avvenuto correttamente**");
		} catch (SQLException e) {
			System.out.println("Errore durante la creazione dello statement SQL: " + e.getMessage());
		}
	}
}
