package thread;

public class Auto3 implements Runnable {

	@Override
	public void run() {
		System.out.println(" io sono " + Thread.currentThread().getName());
		Thread m1 = new Thread(new Auto3());
		
		m1.start();
	}

}
