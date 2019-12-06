package Inheritance;

import java.util.Scanner;

public class TestAnimale {


	public static void main(String[] args) {

		Cane c = new Cane();
		Gatto g = new Gatto();
		Lupo l = new Lupo();
		Cavallo cv = new Cavallo();

		Scanner sc = new Scanner(System.in);
	
		do {
			System.out.println("*******GIOCHIAMO*******");
			System.out.println("che animale vuoi essere... \n"
					+ " << EXIT per uscire!>>");
			String x = sc.nextLine();


			if (x.equalsIgnoreCase("cane")) 
				c.verso();
			else if (x.equalsIgnoreCase("gatto")) 
				g.verso(); 
			else if (x.equalsIgnoreCase("lupo"))
				l.verso();
			else if (x.equalsIgnoreCase("cavallo"))
				cv.verso();
			else if (x.equalsIgnoreCase("exit")) {
				System.out.println("bye!");
				break;
			}
			else System.out.println("l'animale non esiste :( \n ******************"); 
		}

		while(true);
		
		sc.close();
		}
	}