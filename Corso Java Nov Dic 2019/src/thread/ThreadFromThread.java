package thread;

public class ThreadFromThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++){
		
		try {
			Thread.sleep(2000);
			System.out.println(this.getName()+" " + i);	
		} catch (InterruptedException e) {
			
		}
		}
	}
	
	

}
