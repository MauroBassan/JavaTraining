package base;

import java.util.Scanner;

public class InputDaTastiera {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digita un numero...");
		int x = sc.nextInt(); sc.nextLine();
		sc.close();
		calcolaGiorno(x);
	}
	
	public static void calcolaGiorno(int x) {
		if(x==1)System.out.println("luned�");
		else if(x==2) System.out.println("marted�");
		else if(x==3) System.out.println("mercoled�");
		else if(x==4) System.out.println("gioved�");
		else if(x==5) System.out.println("venerd�");
		else if(x==6) System.out.println("sabato");
		else if(x==7) System.out.println("domenica");
		else {
			System.out.println("la settimana ha sette giorni!");
		}
	}
}

