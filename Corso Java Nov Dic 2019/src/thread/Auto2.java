package thread;

public class Auto2 implements Runnable {

	@Override
	public void run() {
		System.out.println(" io sono " + Thread.currentThread().getName());
		Thread y = new Thread(new Auto2());
		
		y.start();
	}

}
