package base;
import java.util.Scanner;
public class InputDaTastieraString {

		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("digita un numero...");
			int x = sc.nextInt(); sc.nextLine();
			System.out.println(calcolaGiorno(x));
		}

		public static String calcolaGiorno(int x) {
			String giorno;
			if(x==1)giorno="luned�";
			else if(x==2) giorno="marted�";
			else if(x==3) giorno="mercoled�";
			else if(x==4) giorno="gioved�";
			else if(x==5) giorno="venerd�";
			else if(x==6) giorno="sabato";
			else if(x==7) giorno="domenica";
			else {
				giorno="la settimana ha sette giorni!";
			}
			return giorno;
		}
	}