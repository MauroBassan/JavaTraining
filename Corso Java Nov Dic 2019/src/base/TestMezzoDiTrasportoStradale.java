package base;

import Inheritance.Auto;
import Inheritance.Moto;


public class TestMezzoDiTrasportoStradale {

	public static void main(String[] args) {
		Auto a = new Auto("BMW", "M3", "BerlinaSport", 3, 4);
		Auto b = new Auto("Audi", "RS4", "Sport", 5,5);
		
		Moto c = new Moto("Kawasaki", "Ninja", "Sport", 2, false);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString() + "inpenna: " + c.Inpenna());
		
	}

}
