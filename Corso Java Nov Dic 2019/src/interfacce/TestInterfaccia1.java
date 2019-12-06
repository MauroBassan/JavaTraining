package interfacce;

public class TestInterfaccia1 {
	
	public static void main(String[] args) {
		Interface1Impl1 ii1 = new Interface1Impl1();
		ii1.metodo1();
		System.out.println(ii1.metodo2());
		System.out.println(ii1.metodo3(10, 10));
		
		System.out.println("-----------------");
	}

}
