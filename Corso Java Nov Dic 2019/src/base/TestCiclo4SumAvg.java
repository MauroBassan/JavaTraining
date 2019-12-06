package base;

import java.util.Scanner;

public class TestCiclo4SumAvg {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserire valore iniziale:");
		int x = sc.nextInt(); sc.nextLine();
		System.out.println("inserire valore finale:");
		int y=sc.nextInt(); sc.nextLine();
		sc.close();
		
		int sum =0;
		
		for(int i=x+1; i<y; i++) {
			
			sum=i+sum;	
		}
		System.out.println(sum);
		
		
	}
}
