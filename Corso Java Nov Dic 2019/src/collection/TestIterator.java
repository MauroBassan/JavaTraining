package collection;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestIterator {
	public static void main (String[] args) {

		//BEST PRACTICE definire classe in variabile di superclasse
		List<String> nomi_al = new ArrayList<>();
		List<String> nomi_v = new Vector<>();
		List<String> nomi_ll = new LinkedList();

		nomi_al.add("Mauro");
		nomi_al.add("Matilde");
		nomi_al.add("Kurtney");
		nomi_al.add("Filippo");
		nomi_al.add("Cristina");
		
		for(String x : nomi_al) {
			System.out.println(x);
		}
		//stampa la dimensione di nomi_al
		System.out.println(nomi_al.size());
		System.out.println("---------------------------");
		
		// creo l'iteratore
		Iterator itera = nomi_al.iterator();
		
		for(int x = 0; x < nomi_al.size(); x++) {
			System.out.println(nomi_al.get(x));
			nomi_al.remove(x);	
		}
		System.out.println(nomi_al.size());
		
		while(itera.hasNext()) {
			System.out.println(itera.next());
			itera.remove();
			}
		System.out.println(nomi_al.size());
		
//		for(int i = 0; i < nomi_al.size(); i++) {
//			System.out.println(nomi_al.get(i));
//		}		
		
		
		//rimuove el a index 0 e scala gli altri
//		nomi_al.remove(0);
		
		//METODO hasNEXT() ritorana una valore booleano, quindi se nell'array dopo un el ce n'è 
		// un altro, il metodo ritorna true e quindi stampa il valore dell'el successivo.
		
		}
	}
