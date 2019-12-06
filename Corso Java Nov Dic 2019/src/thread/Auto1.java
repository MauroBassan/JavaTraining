package thread;

import java.util.Random;

public class Auto1 implements Runnable {

	Random random = new Random();
	String auto;
	int z;
	static int traguardo = 1;

	@Override
	public void run() {
		
		System.out.println("l'auto " + Thread.currentThread().getName() + " è partita!");
		z = random.nextInt(5);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("io sono " + Thread.currentThread().getName() + " e ho eseguito " + i +" giri!");	
			if(i==z) {
				cambiogomme();
			}
			try {	
				Thread.sleep(1000 * (random.nextInt(10)+1));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " is the first one to arrive");
		System.exit(0);
		
	}
	
	
	public void cambiogomme() {
		System.out.println("pit stop per " + Thread.currentThread().getName());
		for(int i = 0; i < 10; i++)
			try {
				Thread.sleep(1000 * (random.nextInt(10)+1));	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

}
}
