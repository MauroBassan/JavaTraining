package modificatori;

public class FiglioDiI4Modificatori extends I4Modificatori {
	
	@Override
	public void stampa() {
		System.out.println("ciao!");
		super.stampa();
		//System.out.println("valore della variabile A: " this.getA());
		System.out.println("valore della variabile B: " + this.getB());
		System.out.println("valore della variabile C: " + this.getC());
		System.out.println("valore della variabile D: " + this.getD());
	}
	public void metodo1() {
		super.c = 1111;
		//this.c=2222;
		System.out.println(this.c);
		super.stampaReference();
		System.out.println(this);
	}
}
