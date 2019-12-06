package array;
import java.util.Random;

public class TestArrayTabelline {
	public static void main(String[] args) {
		
		int[] tab7= new int[10];
		int[] tab9= {5,10,15,20,25,30,35,40,45,50};
		int[] numeriCasuali = new int [10]; 
		Random random = new Random ();
		int x= 7;	
		
		final String TABE7= "*** STAMPA TABELLINA DEL 7 ***";
		final String TABE9= "*** STAMPA TABELLINA DEL 9 ***";
		
		for(int i=0 ; i < tab7.length ; i++ ) {
			tab7[i] = x*(i+1);
		}
		System.out.println(TABE7);
		for(int i=0; i<tab7.length; i++) System.out.println("7x"+ (i+1)+": "+tab7[i]);
		
		System.out.println();
		
		for(int i=0 ; i < numeriCasuali.length ; i++)
			numeriCasuali[i] = random.nextInt(20)+1;
		
		System.out.println(" ***STAMPA NUMERI CASUALI*** ");
		for(int i=0; i<numeriCasuali.length; i++)
		System.out.println((i+1) + ":"  + numeriCasuali[i]);
		
			
		}
	}


