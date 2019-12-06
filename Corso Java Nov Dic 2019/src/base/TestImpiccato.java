package base;

import java.util.Scanner;

public class TestImpiccato {

	public static void main(String[] args) {
		char [] array_parola= new char[0];
		Scanner sc = new Scanner (System.in);
		System.out.println("inserisci parola da indovinare:");
		String parola = sc.nextLine();
		// ora pulisco schermo con 20 righe
		
		array_parola = parola.toCharArray();
		System.out.println(array_parola);
		
		int lengthparola=(parola.length()-2);
		System.out.println("numero tentativi a disposizione " + lengthparola);
		for (int i = 0; i < 20; i++) {
			System.out.println("\n");	
		}
		for (int i = 0; i < array_parola.length; i++) {
			if (i==0) { System.out.print(array_parola[i]);
			continue;
			}
			if (i==array_parola.length-1) {
				System.out.println(array_parola[i]);
				break;
			}
			System.out.print("_");
		
		System.out.println("indovina lettera");
		String utente=sc.nextLine();
		
		}
	}
}
