package Inheritance;

public class TestABC {

	public static void main(String[] args) {
		C c = new C();
		System.out.println("io sono il reference memorizzato dentro la variabile c: " + c);
		System.out.println("c è un'istanza di C? " + (c instanceof C));
		System.out.println("c è un'istanza di B? " + (c instanceof B));
		System.out.println("c è un'istanza di A? " + (c instanceof A));
		System.out.println("c è un'istanza di A? " + (c instanceof Object));
	}

}
