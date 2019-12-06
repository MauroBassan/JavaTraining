package eccezioni;

public class Eccezione1 {
	
	int y;
	
	public void method() {
		try {
			int i = 2/y;
		}
		catch(NullPointerException n) {
			y +=3;
		}
		catch(RuntimeException r) {
			y +=5;
			return;
			//il finally lo esegue comunque
		}
		catch(Exception e) {
			y +=7;			
		}
		finally {
			y +=6;
		}
		y +=4;
	}


public static void main(String[] args) {
	Eccezione1 te = new Eccezione1();
	te.method();
	System.out.println(te.y);
	

}
}