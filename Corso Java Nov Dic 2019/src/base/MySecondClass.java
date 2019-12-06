package base;

public class MySecondClass {
	
	static int x, y;
	
	public static void main(String[] args) {
		metodo1();
		System.out.println("io sono il metodo main");
		
	}
	public static void metodo1() {
		x = 10;
		y = 20;
		metodo2();
		System.out.println("io sono il metodo 1");
	}
	public static void metodo2() {
		System.out.println(x+y);
		
	}

}
