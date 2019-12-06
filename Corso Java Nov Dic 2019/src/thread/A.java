package thread;

public class A implements Runnable {

	@Override
	public void run() {
		System.out.println("io sono la classe A"+ Thread.currentThread().getName());
	}

}
