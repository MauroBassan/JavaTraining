package eccezioni;

import java.util.Scanner;

import esercizio.Cinema;

public class TestCinema {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Cinema c1 = new Cinema ();

		Scanner sc = new Scanner (System.in);
		

		do {
		System.out.println("*** ingresso cinema ***");
		
		System.out.println("*** luci rosse? ***");
		c1.controlloCinema(sc.nextLine());
		
		System.out.println("inserire nome: (digitare stop per uscire)" );
		p1.setNome(sc.nextLine());
		if(p1.getNome().equalsIgnoreCase("stop")) { 
			System.out.println("bye!"); break;
		}
		
		System.out.println("inserire l'età:");
		p1.setAge(sc.nextInt());
		try {
			c1.metodoCheckAge(p1.getNome(),p1.getAge());
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}
		}while(true);
	}

}