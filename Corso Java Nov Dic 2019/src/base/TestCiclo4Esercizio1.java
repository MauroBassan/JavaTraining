package base;
import java.util.Scanner;

public class TestCiclo4Esercizio1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserire il valore da cui iniziare a contare:");
		int start = sc.nextInt(); sc.nextLine();
		System.out.println("tabellina del:");
		int incr= sc.nextInt(); sc.nextLine();
		System.out.println("fino a quanto vuoi contare:");
		int max=sc.nextInt(); sc.nextLine();
		sc.close();


		for(int i=start; i<=max; i+=incr ) {
			System.out.println("il valore di i è:" + i);

		}
	}
}