package esercizio;

import java.util.InputMismatchException;
import java.util.Scanner;

import eccezioni.Persona;

public class TestCinema {

	public static void main(String[] args) throws InputMismatchException {
		Cinema c = new Cinema();
		int [] Clienti = new int [10];
		Scanner sc = new Scanner(System.in);

		int scelta = 0;
		do {
			System.out.println("* GESTIONE CIMENA *");
			System.out.println("---------------------");

			System.out.println("scegliera una opzine:");
			System.out.println("1. inserire prenotazione");
			System.out.println("2. modifica prenotazione");
			System.out.println("3. cancella prenotazione");
			System.out.println("4. visualizza prenotazione");
			System.out.println("5. visualizza tutte");
			System.out.println("6. programmazione cinema");
			System.out.println("7. uscita");

			try {
				scelta = sc.nextInt(); sc.nextLine();
				System.out.println("hai scelto: " + scelta);
				if(scelta == 7) { System.out.println(" bye! ");
				}
				else if(scelta <1 || scelta > 7) throw new InputMismatchException(); 
			} catch (InputMismatchException e) { 
				System.out.println("\n 6 esaurito!!!");
				sc.nextLine();
				continue;
			}
			switch(scelta) {
			case 1: c.metodoPrenotazione();;
			break;
			case 2: c.metodoModifica();
			break;
			case 3: c.metodoCancella();
			break;
			case 4: c.metodoView();
			break;
			case 5: c.metodoViewAll();
			break;
			case 6: c.metodoProgrammazione();
			break;
			}
		}while (scelta != 7);

		sc.close();
	}

}