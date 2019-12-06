package thread;

public class ClasseA implements Runnable {

	@Override
	public void run() {
		
		System.out.println(" io sono la classe A ClasseA" + Thread.currentThread().getName());
		Thread a1 = new Thread(new A());
		Thread a2 = new Thread(new A());
		
		a1.start();
		a2.start();
		
	}
	

}
