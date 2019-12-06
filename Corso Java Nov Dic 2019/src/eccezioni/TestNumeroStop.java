package eccezioni;

import java.util.Scanner;

public class TestNumeroStop {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int x;
		String stop;
		
		do { 
			System.out.println("immettere un numero oppure digitare stop!");
			stop=sc.nextLine();
			if(stop.equalsIgnoreCase("stop")) {
				System.out.println("bye!");
				break;
			}
			try {
			x = Integer.parseInt(stop);
			} catch (NumberFormatException n) {
				System.out.println("il valore digitato non è un numero!");
			}
			
		} while(true);
}
}
