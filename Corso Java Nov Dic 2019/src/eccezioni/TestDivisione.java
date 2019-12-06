package eccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDivisione {

	public static void main(String[] args) {
		
		int x = 0, y = 0, result = 0, resto = 0;
		
		Scanner sc= new Scanner(System.in);
		try {
		System.out.println("inserire dividendo");
		x=sc.nextInt();
			
		System.out.println("inserire divisore");
		y=sc.nextInt();
		} catch (InputMismatchException i) {
			System.out.println("il valore immesso non è di tipo numerico!");
			System.exit(0);
		}
		
		
		try {
		result= x / y;
		resto= x % y;
		
		} catch (ArithmeticException e) {
			System.out.println("divisione per zero non consentita" + " divisore impostato a 1." + e.getMessage());
			y=1;
			result=x/y;
			
		} catch (RuntimeException e ) {
			System.out.println("operazione non consentita");
		} finally { 
			System.out.println("*** eccezione catturata!? ***");
			// il finally lo esegue sempre
		}
		
		System.out.println("il risultato della divisione è:" + result + " con l'avanzo di: " + resto);
		
	}
	

}
