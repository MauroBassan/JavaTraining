package base;

import Inheritance.Gatto;

public class TestString1 {

	public static void main(String[] args) {
		
		//Gatto g1;
		
		String s3 = new String("mauro");
		String s2 = "mauro";
		
		String s1 = "mauro";
		System.out.println(s1);
		
		//g1 = new Gatto();
		//System.out.println(g1);
		
		System.out.println(s1);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		StringBuilder sbld = new StringBuilder();
		sbld.append("ciao da mauro");
		
	}

}
