package generics;

import Inheritance.Animale;
import Inheritance.Gatto;

public class TestMetodoGenerics {

	public static void main(String[] args) {
		int x = 10;
		boolean b = true;
		String s = "mauro";

		System.out.println(metodo1(x));
		System.out.println(metodo1(b));
		System.out.println(metodo1(s));

		System.out.println(metodo1(x,11,"cicco", "pasticco"));
		System.out.println(metodo1(b, 22, 11.1f, 11.1));
		System.out.println(metodo1(s, 33, true, new Gatto()));

		new TestMetodoGenerics().metodo2(100, 110.4f);
		new TestMetodoGenerics().metodo2(true, 110.4f);
		new TestMetodoGenerics().metodo2("ciao", "c");
		
		

	}
	
	private static <T> String metodo1(T x) {

		if(x instanceof Integer) {
			Integer xx = (Integer) x*3;
			x = (T) xx;
		}

		if(x instanceof String) {
			x = (T) (x + "ciao");
		}

		return (x+ " - " + x.getClass().getSimpleName());
	}

	private static <T1, T2, T3> String metodo1(T1 t1, int y, T2 t2, T3 t3) {

		if(t1 instanceof Integer) {
			Integer xx = (Integer)t1*y;
			t1 = (T1) xx;
		}

		if(t1 instanceof String) {
			t1 = (T1) (t1 + "ciao");
		}

		if (t3 instanceof Animale)  System.out.println("mao");

		return (t1+ " - " + t1.getClass().getSimpleName() + " - "+ t2 + " - "+ t3);
	}
	
	public static <V1,V2> void metodo2(V1 value1, V2 value2) {
		System.out.println(value1 + "-" + value1.getClass().getSimpleName());
		System.out.println(value2 + "-" + value2.getClass().getSimpleName());
	}

	
 }