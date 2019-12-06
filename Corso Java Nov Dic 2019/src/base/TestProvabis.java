package base;

public class TestProvabis {
	
	public static void main(String[] args) {
		int x,y,z;
		
		x = 12;
		y = 32;
		z = 14;
		
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
