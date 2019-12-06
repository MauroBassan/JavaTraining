package modificatori;

public class TestI4Modificatori {
	public static void main (String[] args) {
		I4Modificatori i4m = new I4Modificatori();
		FiglioDiI4Modificatori fi4m = new FiglioDiI4Modificatori();
		
		i4m.b=21;
		i4m.c=31;
		i4m.d=41;
		
		System.out.println(i4m.getB());
		System.out.println(i4m.getC());
		System.out.println(i4m.getD());
		// oppure usiamo metodo stampa definito in I4Modificatori
		i4m.stampa();
		
		fi4m.b=220;
		fi4m.c=330;
		fi4m.d=440;
		
		System.out.println(fi4m.getB());
		System.out.println(fi4m.getC());
		System.out.println(fi4m.getD());
		// oppure usiamo metodo stampa definito in I4Modificatori
		fi4m.stampa();
		// ora lo stampa in base a come lo abbiamo ridefinito nella classe figlio!!!
	
	}

}
