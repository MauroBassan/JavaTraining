package base;

import java.util.Scanner;

public class TestScanner11nov {
	
	public static void main(String[] args) {
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("inserire val x: ");
		x=sc.nextInt();sc.nextLine();
		System.out.print("inserire val y: ");
		y=sc.nextInt();sc.nextLine();
		System.out.print("inserire val z: ");
		z=sc.nextInt();sc.nextLine();
		
		metodoSomma(x,y,z);
		metodoMoltiplica(x,y,z);
	}
	
	public static void metodoSomma(int a, int b, int c) {
		System.out.println("la somma è: " + (a+b+c));
	}
	
	public static void metodoMoltiplica(int a,int b, int c) {
		System.out.println("il prodotto è: " + (a*b*c));
	}

}
