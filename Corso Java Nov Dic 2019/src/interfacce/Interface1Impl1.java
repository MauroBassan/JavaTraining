package interfacce;

public class Interface1Impl1 implements Interfaccia1 {

	@Override
	public void metodo1() {
		System.out.println("io sono il metodo della classe Interface1Impl1" );	
	}

	@Override
	public int metodo2() {
		return 25;
	}

	@Override
	public String metodo3 (int x, int y) {
		String s = "Totale = " + String.valueOf(x+y);
		return s;
	}

}
