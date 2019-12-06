package thread;

import java.util.Random;
import java.util.Scanner;

public class TestAutoDaCorsa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
		
		Thread a = new Thread(new Auto1());
		Thread b = new Thread(new Auto1());
		Thread c = new Thread(new Auto1());
	
		System.out.println("*** car code race ***");
		System.out.println("inserire auto1:");
		String auto1= sc.nextLine();
		System.out.println("inserire auto2:");
		String auto2= sc.nextLine();
		System.out.println("inserire auto3:");
		String auto3= sc.nextLine();
		
		a.setName(auto1);
		a.setPriority(random.nextInt(10)); 
		// oppure: setPriority(Thread.MIN_PRIORITY); gli diciamo che il thread ha priorità minima
		//a.setDaemon(true);
		
		b.setName(auto2);
		b.setPriority(random.nextInt(10)); 
		// oppure: setPriority(Thread.MIN_PRIORITY); gli diciamo che il thread ha priorità minima
		//b.setDaemon(false);
		
		c.setName(auto3);
		c.setPriority(random.nextInt(10)); 
		// oppure: setPriority(Thread.MIN_PRIORITY); gli diciamo che il thread ha priorità minima
		//c.setDaemon(false);
		
		System.out.println("pronti...");
		System.out.println("parteza...");
		System.out.println("VIA!");
		a.start();
		b.start();
		c.start();
	}
}
