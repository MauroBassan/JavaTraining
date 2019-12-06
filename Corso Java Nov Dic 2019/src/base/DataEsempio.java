package base;

public class DataEsempio {
	
	int giorno;
	int mese;
	int anno;
	
	public DataEsempio() {
		giorno=18;
		mese=11;
		anno=2019;
		System.out.println("io sono il met costrut 1");
	}
	
	public DataEsempio(int gg, int mm) {
		giorno=gg;
		mese=mm;
		anno=2019;
		System.out.println("io sono il met costrut 2");
	}
	
	public DataEsempio( int aa) {
		giorno=18;
		mese=11;
		anno=aa;
		System.out.println("io sono il met costrut 3");
	}
	
	public void metodo1() {
		System.out.println("io sono il metodo1");
	}
	
	public void Esempio () {
		System.out.println("io sono l'esempio");
	}
	

}
