package thread;

public class B implements Runnable {

	@Override
	public void run() {
		System.out.println("sono la classe B"+ Thread.currentThread().getName());
		countdown();
	}

	synchronized static public void countdown() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}