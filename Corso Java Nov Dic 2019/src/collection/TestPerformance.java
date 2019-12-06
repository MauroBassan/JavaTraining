package collection;

import java.util.List;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Vector;

public class TestPerformance {

	public static void main(String[] args) {
		
		List <String> v = new Vector<> ();
		List<String> a = new ArrayList<>();
		List<String> l = new LinkedList<>();
		
		long start, end;
		
		for (int i =0; i < 10000; i++) {
			v.add("ciao"+i);
		}
		System.out.println("size of v: " + v.size());	
	
	start= System.nanoTime();
	for(int i = 0; i < 10000; i++) {
		//System.out.println(v.get(i));
	}
	end= System.nanoTime();
		System.out.println("elapsed time for vector: " + (end-start));
	
	a = v;
	
	start= System.nanoTime();
	for(int i = 0; i < 10000; i++) {
		//System.out.println(a.get(i));
	}
	end= System.nanoTime();
		System.out.println("elapsed time for arraylist: " + (end-start));
	
	l=v;
	start= System.nanoTime();
	for(int i = 0; i < 10000; i++) {
		//System.out.println(l.get(i));
	}
	end= System.nanoTime();
		System.out.println("elapsed time for linkedlist: " + (end-start));
	}
	
}
