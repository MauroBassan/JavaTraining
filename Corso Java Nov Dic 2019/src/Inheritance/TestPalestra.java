package Inheritance;

import java.util.Scanner;

public class TestPalestra {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("inserire nome:");
		String nome = sc.nextLine();
		
		System.out.println("data iscrizione:");
		String dataIscrizione = sc.nextLine();
		
		System.out.println("inserire quota:");
		int canone = sc.nextInt();
		
		Soci s1 = new Soci (nome, dataIscrizione, canone);
		Soci s2 = new Soci ("Mauro", "11agosto2019", 200);
		Soci s3 = new Soci ("Luigi", "12aprile2019", 400);
		Soci s4 = new Soci ("Fil", "20nov2019", 500);
		
		s1.metodoIscrizione();
	}
	
}
