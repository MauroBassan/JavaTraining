package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestNomiNumeriMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(23, "Mauro");
		hm2.put(11, "Matilde");
		hm2.put(96, "Kurtney");
		hm2.put(44, "Filippo");
		hm2.put(18, "Cristina");
		System.out.println("\n***HashMap2");
		System.out.println(hm2);
		// dobbiamo dirgli di andare a leggere hm e restituirci il set di kv di quella struttura
		// DA SAPERE A MEMORIA
		System.out.println("\n***stampare hm con ciclo foreach ");
		for(Integer k : hm2.keySet()) {
			System.out.println("key: " + k + " - " +"value: " + hm2.get(k));
		}
		
		//mi creo un set che extends collection e dentro a Set metto tutte le entry che arrivano da mia mappa
		//stiamo portando una mappa in un set
		Set <Map.Entry<Integer, String>> setMap =  hm2.entrySet();
		Iterator <Entry<Integer, String>> itera = setMap.iterator();
		System.out.println("\n***Entry ");
		
		Entry <Integer, String> e = null;
		while(itera.hasNext()) {
			e = itera.next();
			System.out.println(e.getKey() + " " + e.getValue());

		}
	}

}