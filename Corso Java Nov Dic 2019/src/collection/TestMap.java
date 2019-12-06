package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;
import java.util.List;

public class TestMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		HashMap<Integer, String> hm2 = new HashMap<>();
		Vector<String> v = new Vector<>();
		HashSet<String> hs = new HashSet<>();
		
		
		hs.add("Mauro");
		hs.add("Carlo");
		hs.add("Fabrizio");
		hs.add("Lory");
		hs.add("Lory");
		hs.add("Lory");
		// stampa Lory solo 1 volta perchè hashset non accetta duplicati
		System.out.println("\n***HashSet");
		System.out.println(hs);
		
		v.add("Mauro");
		v.add("Carlo");
		v.add("Fabrizio");
		v.add("Lory");
		v.add("Lory");
		v.add("Lory");
		// stampa tutto, il vector accetta tutto
		System.out.println("\n***Vector");
		System.out.println(v);
		
		hm.put(10, "aaa");
		hm.put(20, "bbb");
		hm.put(30, "ccc");
		// sostituisce Lory al valore ccc della chiave 30
		hm.put(30, "Lory");
		//hm.add("Lory");
		//hm.add("Lory");
		System.out.println("\n***HashMap");
		System.out.println(hm);
		System.out.println(hm.get(20));
		
		hm2.put(23, "Mauro");
		hm2.put(11, "Matilde");
		hm2.put(96, "Kurtney");
		hm2.put(44, "Filippo");
		hm2.put(18, "Cristina");
		System.out.println("\n***HashMap2");
		System.out.println(hm2);
		// dobbiamo dirgli di andare a leggere hm e restituirci il set di kv di quella struttura
		System.out.println("\n***stampare hm con ciclo foreach ");
		for(Integer k : hm2.keySet()) {
			System.out.println(k + hm2.get(k));
		}
		
	}

}
