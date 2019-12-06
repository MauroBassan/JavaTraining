package base;

import java.util.Scanner;

public class TestTabellina {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("tabellina del:");
		int tab = sc.nextInt(); sc.nextLine();
		//System.out.println("tabellina del:");
		//int incr= sc.nextInt(); sc.nextLine();
		System.out.println("quante volte vuoi moltiplicare:");
		int max=sc.nextInt(); sc.nextLine();
		sc.close();


		for(int i=1;; i++ ) {
			System.out.println("il valore di i è:" + i*tab);
			if (i>=max) break;

		}
	}
}


