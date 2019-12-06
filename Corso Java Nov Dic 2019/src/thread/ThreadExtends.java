package thread;

public class ThreadExtends extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++){

			try {
				Thread.sleep(1000);
				System.out.println("ciao esteso " + i);	
			} catch (InterruptedException e) {
			}
		}
	}
}
