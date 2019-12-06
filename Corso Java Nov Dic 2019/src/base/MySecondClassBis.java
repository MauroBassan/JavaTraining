package base;

public class MySecondClassBis {
	public static void main(String[] args) {
		metodo1();
		System.out.println("io sono il metodo main");
		
	}
	public static void metodo1() {
		int x = 10;
		int y = 20;
		
		metodo2(x,y);
		System.out.println("io sono il metodo 1");
	}
	public static void metodo2(int x,int y) {
		System.out.println(x+y);
		
	}

}
