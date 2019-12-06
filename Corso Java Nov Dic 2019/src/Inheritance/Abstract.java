package Inheritance;

public abstract class Abstract {

	public Abstract() {
		
	}
	
	void metdo1 () {
		System.out.println("Io sono il metodo1 della classe Abstract");
	}
	
	void metdo2 (int x) {
		System.out.println("Io sono il metodo2 della classe Abstract e valgo " + x);
	}
	
	void metodo3 (String s) {
		System.out.println("Io sono il metodo3 della classe Abstract e dico " + s);
	}
	
	abstract void metodo4 ();
}
