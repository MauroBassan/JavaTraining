package thread;

public class TestThread {

	public static void main(String[] args) {
		
		ThreadExtends te = new ThreadExtends();
		Thread ti = new Thread(new ThreadImplement());
		
		te.start();
		ti.start();
		
	}

}
