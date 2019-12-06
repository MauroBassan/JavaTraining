package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestNomiNumeri {

	public static void main(String[] args) {
		Integer y = 0;
		List<String> nominumeri = new ArrayList<>();
		List<String> nuovinomi = new ArrayList <>();
		List<Integer> nuovinumeri = new ArrayList <>();
		nominumeri.add("23 Mauro");
		nominumeri.add("11 Matilde");
		nominumeri.add("96 Kurtney");
		nominumeri.add("44 Filippo");
		nominumeri.add("18 Cristina");

		System.out.println("NOMINUMERI");
		for(String x : nominumeri) {
			System.out.println(x);
		}
		//stampa la dimensione di nomi_al
		System.out.println(nominumeri.size());
		System.out.println("---------------------------");

		System.out.println("NUOVINOMI");
		for(String i : nominumeri) {
			String x = i.substring(3);
			nuovinomi.add(x);
			System.out.println(x);
		}
		System.out.println(nuovinomi.size());
		System.out.println("---------------------------");

		System.out.println("NUOVINUMERI");
		for(String i : nominumeri) {
			y = Integer.parseInt(i.substring(0,2));
			nuovinumeri.add(y);
			System.out.println(y);
		}
		System.out.println(nuovinumeri.size());
		System.out.println("---------------------------");
	
		System.out.println("ESCLUSI: ");

		Iterator<String> itera = nominumeri.iterator();


		//String z = i.substring(0,2);
		//Integer result = String.parseInt(z);
		while(itera.hasNext()) {
			String nome=itera.next();
			int result = Integer.parseInt(nome.substring(0,2));
			if((result%4) == 0)
			
					System.out.println(nome.substring(3));
				itera.remove();
			}
		}
	}
