package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

import eccezioni.Persona;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(true);
		al1.add(123.45);
		al1.add(98.76f);
		al1.add('*');
		al1.add(new Persona());

		for(Object x : al1) {
			System.out.println(x + ": " + x.getClass().getSimpleName());
		}

		System.out.println("----------------------------------");	

		ArrayList <String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("white");
		colors.add("green");
		colors.add("blu");
		colors.add("yellow");

		for( String i : colors) {
			System.out.println(i + ": " + i.getClass().getSimpleName());
		}
		System.out.println("-------------------------------");

		for(int i = 0; i< colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		System.out.println("-------------------------------");


		Scanner sc = new Scanner(System.in);
		String colore;
		Vector<String> colors_v = new Vector <String>(); 

		do {
			System.out.println("inserisci un colore a tuo piacimento");

			colore = sc.nextLine();

			if(colore.equalsIgnoreCase("end")) break;

			colors_v.add(colore);

		}while(true);
		for ( String i : colors_v) {
			System.out.println(i);
		
		}System.out.println(colors_v.capacity());
		
		ArrayList<String> colors_al= new ArrayList<>();
		for(String i : colors_v) {
			colors_al.add(i);}
		System.out.println(colors_al);
	
	
		LinkedList<String> colors_ll = new LinkedList<String>();
		for(String i : colors_v) {
			colors_ll.add(i); }
		System.out.println(colors_ll);
		
		}
	
	}
	