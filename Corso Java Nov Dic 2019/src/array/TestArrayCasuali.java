package array;

import java.util.Random;
import java.util.Scanner;

public class TestArrayCasuali {
	
	public static void main(String[] args) {

		//DEFINISCO ELEMENTI E VAR
		int[] numeriCasuali = new int [10]; 
		Random random = new Random ();
		Scanner sc = new Scanner(System.in);
		int tentativi=0;
		boolean trovato=false;

		//VALORIZZARE L'ARRAY CON NUMERI CASUALI 1-20
		for(int i=0 ; i < numeriCasuali.length ; i++) {
			numeriCasuali[i] = random.nextInt(20)+1;
		}
		//ciclo do...while
		do {
			//ACQUISIZIONE DATI UTENTE
			System.out.println("che numero vuoi cercare?");
			int trovaNumero = sc.nextInt(); sc.nextLine();
			tentativi++;
			//CICLARE VALORI ARRAY E MATCH CON INPUT UTENTE
			for(int x:numeriCasuali) {

				if(x==trovaNumero) 
					System.out.println("U got it!" + tentativi + "tentativi");
				trovato=true;
				break;
			} 
		
		if(tentativi > 10 && trovato==false) {
			System.out.println("tentativi esauriti!");
			break;
		}
		if(!trovato) System.out.println("il numero dgt non è presente! Riprova...");
		}
		while (!trovato);
		System.out.println();

		// STAMPO ARRAY
		System.out.println("*** STAMPA NUMERI CASUALI ***");
		for(int i = 0; i < numeriCasuali.length; i++) 
			System.out.println((i+1) + ":" + numeriCasuali[i]);
	}
}







