package eccezioni;

import java.util.Scanner;
import java.util.zip.DataFormatException;

import javax.management.BadAttributeValueExpException;

public class TestCalcolatrice {

	public static void main(String[] args) throws DataFormatException {
		
		//non serve creare la variabile tanto dopo l'istanza viene cancellata dalla memory! vedi new Calcolatrice nelllo switch!
		//Calcolatrice cc = new Calcolatrice();
		Scanner sc = new Scanner(System.in);
		System.out.println("*** CALCOLI ARITMETICI ***");
		System.out.println("* inserire primo operatore: ");
		int x = sc.nextInt();
		System.out.println("* inserire secondo operatore: ");
		int y = sc.nextInt(); sc.nextLine();
		System.out.println("* operazione da eseguire (+,-,*,/,%): ");
		String operazione = sc.nextLine();
		
		System.out.println("hai chiesto di effettuare questa operazione: " + x + operazione + y);
		
		switch (operazione) {
		
		case "+": System.out.println("Il risultato dell'addizione è :" + new Calcolatrice().somma(x, y));
		break;
		
		case "-": System.out.println("Il risultato della sottrazione è :" + new Calcolatrice().sottrazione(x, y));
		break;
		
		case "*": 
			try {
			System.out.println("Il risultato della moltiplicazione è :" + new Calcolatrice().moltiplicazione(x, y));
			} catch (DataFormatException d) {
				System.out.println("moltiplicazione non consentita: " + d.getMessage());
			}
			catch (BadAttributeValueExpException b) {
				System.out.println("moltiplicazione non consentita: " + b.getMessage());
			}
		break;
		
		case "/": 
		try {
			int[] risultati = new Calcolatrice().divisione(x, y);
			System.out.println(risultati[0] + " con il resto di: " + risultati[1]);
		} catch (ArithmeticException e) {
			System.out.println("Operazione non consentia!" + e.getMessage());
		}
		break;
		default: System.out.println("che vuoi fa!!!");
	}
		System.out.println("***BYE!***");
		sc.close();
	}
	
	
}

