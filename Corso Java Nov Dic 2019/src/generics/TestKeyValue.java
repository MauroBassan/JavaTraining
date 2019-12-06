package generics;

import java.util.ArrayList;

import Inheritance.Animale;
import Inheritance.Cane;
import Inheritance.Gatto;

public class TestKeyValue {

	public static void main(String[] args) {
		int x;
		double y;

		x = 10;
		y = 12.5;

		KeyValue<Integer, String> kv1 = new KeyValue<>();
		kv1.setK1(x);
		kv1.setK2("ciao");		
		System.out.println("Key: " + "(" + kv1.getK1().getClass().getSimpleName() +") " + kv1.getK1() + " - " + "Value: " + "("+kv1.getK2().getClass().getSimpleName()+") " + kv1.getK2());


		KeyValue<Boolean, String> kv2 = new KeyValue<>();
		kv2.setK1(true);
		kv2.setK2("Mauro");
		System.out.println("Key: " + kv2.getK1() + " - "+ "Value: " + kv2.getK2());

		KeyValue<String, String> kv3 = new KeyValue<>();
		kv3.setK1("Auto preferita");
		kv3.setK2("BMW M2");
		System.out.println("Key: " + kv3.getK1() + " - "+ "Value: " + kv3.getK2());

		
		
		int conta=0;

		KeyValue [] lista = new KeyValue[6];

		//abbiamo creato gli oggetti nell'array
		lista[conta] = new KeyValue<Integer, String>();
		lista[conta].setK1(10);
		lista[conta].setK2("ciao");
		++conta;
		
		lista[conta] = new KeyValue<Boolean, String>();
		lista[conta].setK1(true);
		lista[conta].setK2("Mauro");
		++conta;
		
		lista[conta] = new KeyValue<String, String>();
		lista[conta].setK1("auto preferita");
		lista[conta].setK2("M2");
		++conta;
		
		lista[conta] = new KeyValue<Integer, Integer>(11,22);
		++conta;
		
		lista[conta] = new KeyValue<Boolean, Float>(true, 11.55f);
		++conta;
		
		lista[conta] = new KeyValue<Gatto, Object>(new Gatto(), 0);
		

		for(int i = 0; i<lista.length; i++) {
			System.out.println(lista[i].getK1()+ " - " + lista[i].getK2());
		}
		
		metodoStampa(lista);

		System.out.println("-------------------------------------");
		
		ArrayList <KeyValue> listakv = new ArrayList <>();

		listakv.add(new KeyValue <Integer, String>());
		listakv.get(0).setK1(10);
		listakv.get(0).setK2("ciao");

		listakv.add(new KeyValue <Boolean, String>());
		listakv.get(1).setK1(true);
		listakv.get(1).setK2("mauro");

		listakv.add(new KeyValue <String, String>());
		listakv.get(2).setK1("auto prefe");
		listakv.get(2).setK2("M2");
		
		listakv.add(new KeyValue <Integer, Integer>(20,20));
		listakv.add(new KeyValue <Integer, Integer>(50,50));
		listakv.add(new KeyValue <Gatto, Object>(new Gatto()));
		listakv.get(5).setK2(1);
		

		for (int i = 0; i < listakv.size(); i++) {
			System.out.println(listakv.get(i).getK1().getClass().getSimpleName() + " - " + listakv.get(i).getK2().getClass().getSimpleName());	
		}
		
		metodoStampa(listakv);
		
		metodo1(11);
		metodo1(11.0);
		metodo1(11.1f);
		metodo1(11111);
		
		metodo2(new Gatto());
		metodo2(new Cane());
	}
	
	private static <A extends Animale> void metodo2(A a) {
		System.out.println(a + " " + a.getClass().getSuperclass());
	}

	private static <N extends Number> void metodo1(N i) {
		System.out.println(i + " " + i.getClass().getSimpleName());
		
	}

	public static <M> void metodoStampa(ArrayList<KeyValue> listakv) { 

		for(KeyValue i : listakv ) {
			System.out.println(i.toString());
		}
	}
	
	public static <M> void metodoStampa(M[] lista) {
		for(M i : lista ) {
			System.out.println(i.toString());
		}
	}

}