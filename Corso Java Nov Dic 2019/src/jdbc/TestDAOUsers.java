package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class TestDAOUsers {

	static Users user; //DTO
	static Scanner sc = new Scanner(System.in);
	static DAOUsers dui = new DAOUsersImpl();  //DAO

	public static void main(String[] args) {

		// questa classe è un implementazione di questa interfaccia e quindi deve rispettare il contratto

		int scelta;

		do {
			stampaMenu();

			scelta= sc.nextInt();

			switch (scelta) {
			case 1: inserimento(); break;
			case 2: modifica(); break;
			case 3: lettura(); break;
			case 4:	letturaAll(); break;
			case 5: cancellazione(); break;
			case 9: System.out.println("*** arrivederci ***"); break;
			default: System.out.println("scelta non consentita, riprovare...");
			}
		} while (scelta != 9);


	}

	private static void stampaMenu() {
		System.out.println("*** GESTIONE UTENTI ***");
		System.out.println("Scegliere una delle opzioni seguenti:");
		System.out.println("1. inserimento");
		System.out.println("2. modifica");
		System.out.println("3. lettura");
		System.out.println("4. lettura tutti utenti");
		System.out.println("5. cancellazione");
		System.out.println("9. uscita");

	}


	private static void cancellazione() {

		System.out.println("specificare id utente da cancellare");

		System.out.println("vuoi davvero proseguire?\n"
				+ "digita y per confermare, n per terminare");
			String cfm = sc.nextLine();
			
			
		try {
			dui.deleteUser(sc.nextInt()); sc.nextLine();
		} catch (SQLException e) {
			System.out.println("si è verificato un errore durante la cancellazione " + e.getMessage());
		}

	}

	private static void letturaAll() {
		try {
			System.out.println("*** carico la lista di tutti gli utenti ***");
			for(Users k : dui.getAllUsers())
			{
				k.printusers();
			}
		} catch (SQLException e) {
			System.out.println("si è verificato un errore durante la lettura: " + e.getMessage());
		}

	}


	private static void lettura() {
		try {
			System.out.println("specificare id da dettgliare");
			user = dui.getUser(sc.nextInt()); sc.nextLine();
			if (user != null) {
				user.printusers();
			}
		} catch (SQLException e) {
			System.out.println("si è verificato un errore durante la lettura dello user: " + e.getMessage());
		}
	}


	private static void inserimento() {

		user = new Users();
		try {	
			System.out.println("specificare id nuovo utente");
			user.setId(sc.nextInt()); sc.nextLine();
			if(((DAOUsersImpl) dui).checkUserId(user.getId()) == false) {
				System.out.println("specificare nome nuovo utente");
				user.setNome(sc.nextLine());
				System.out.println("specificare indirizzo nuovo utente");
				user.setAddress(sc.nextLine());
				System.out.println("specificare mail nuovo utente");
				user.setEmail(sc.nextLine());
				System.out.println("specificare telefono nuovo utente");
				user.setPhone(sc.nextLine());

				dui.addUser(user);}
			else System.out.println("Impossibile creare nuovo utente. Id già presente ");
		} catch (SQLException e) {
			System.out.println("si è verificato un errore durante l'inserimento" + e.getMessage());
		}
	}


	private static void modifica() {

		user = new Users();
		try {
			System.out.println("specificare id utente da modoficare");
			user.setId(sc.nextInt()); sc.nextLine();
			if(((DAOUsersImpl) dui).checkUserId(user.getId()) == true) {
				System.out.println("specificare nome utente");
				user.setNome(sc.nextLine());
				System.out.println("specificare indirizzo utente");
				user.setAddress(sc.nextLine());
				System.out.println("specificare mail utente");
				user.setEmail(sc.nextLine());
				System.out.println("specificare telefono utente");
				user.setPhone(sc.nextLine());

				dui.updateUser(user);} 
			else System.out.println("id non presente!");
		} catch (SQLException e) {
			System.out.println("si è verificato un errore durante l'aggiornamento " + e.getMessage());
		}
	}
}
