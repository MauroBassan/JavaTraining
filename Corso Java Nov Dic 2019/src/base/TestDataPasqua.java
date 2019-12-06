package base;

import java.util.Scanner;

public class TestDataPasqua {
	
	static int anno, mese, data;
	
	public static void main(String[] agrs) {
		int a=0, b=0, c=0, d=0, e=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("scegli anno");
		anno= sc.nextInt();
		sc.close();
		a= anno % 19; System.out.println(a);
		b= anno % 4; System.out.println(b);
		c= anno % 7; System.out.println(c);
		d= ((19*a) + 24)%30; System.out.println(d);
		e= ((2*b)+(4*c)+(6*d)+5)%7; System.out.println(e);
		calcolaMese(d,e);
		calcolaGiorno();
	}
	
	public static void calcolaMese(int d, int e) {
		mese= 22+d+e;
		
		if (mese <=31) System.out.println("Pasqua è a Marzo");
		else if(mese >= 31) System.out.println("Pasqua è ad Aprile");
	}
	
	public static void calcolaGiorno() {
		data=mese-31; System.out.println("il giorno di Pasqua è:" + data);
		
	}
}
	
	
	
		


	
