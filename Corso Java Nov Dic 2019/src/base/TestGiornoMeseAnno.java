package base;
import java.util.Scanner;

public class TestGiornoMeseAnno {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digita giorno...");
		int x = sc.nextInt(); sc.nextLine();
		System.out.println("digita mese...");
		int y = sc.nextInt(); sc.nextLine();
		System.out.println("digita anno...");
		int z = sc.nextInt(); sc.nextLine();
		sc.close();
		System.out.println(calcolaGiorno(x)+" " +calcolaMese(y)+" "+calcolaAnno(z));
	}

	private static String calcolaGiorno(int x) {
		//posso anche storare il valore in una variabile String giorno, se poi devo riusarla
		
		if(x==1)return "lunedì \n";
		else if(x==2) return "martedì \n";
		else if(x==3) return "mercoledì \n";
		else if(x==4) return "giovedì \n";
		else if(x==5) return "venerdì \n";
		else if(x==6) return "sabato \n";
		else if(x==7) return "domenica \n";
		else {
			 return "inserisci un giorno valido \n";
		}
	}
	
	private static String calcolaMese(int y) {
		// stessa cosa come per il giorno
		
		if(y==1) return "gen \n";
		else if(y==2) return "feb \n";
		else if(y==3) return "mar \n";
		else if(y==4) return "apr \n";
		else if(y==5) return "mag \n";
		else if(y==6) return "giu \n";
		else if(y==7) return "lug \n";
		else if(y==8) return "ago \n";
		else if(y==9) return "set \n";
		else if(y==10) return "ott \n";
		else if(y==11) return "nov \n";
		else if(y==12) return "dic \n";
		else {
			return "i mesi sono 12! \n";
		}
	}
	
	private static String calcolaAnno(int z) {
		// stesso discorso come sopra
		if(z%4!=0) return "normale";
		else { return "bisestile";
		}
	}

}