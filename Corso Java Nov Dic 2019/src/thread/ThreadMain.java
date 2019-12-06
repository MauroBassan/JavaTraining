package thread;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadFromThread tft = new ThreadFromThread();
		Thread tfr = new Thread(new ThreadFromRunnable());
		
		tft.setName("threaformclassthread");
		tft.setPriority(1); 
		// oppure: setPriority(Thread.MIN_PRIORITY); gli diciamo che il thread ha priorità minima
		tft.setDaemon(true);
		
		tfr.setName("threaformclassrunnable");
		tfr.setPriority(Thread.MAX_PRIORITY); 
		// oppure: setPriority(Thread.MIN_PRIORITY); gli diciamo che il thread ha priorità minima
		tfr.setDaemon(false);
		
		tft.start();
		tfr.start();
	}

}
