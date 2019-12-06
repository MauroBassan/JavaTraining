package eccezioni;

public class TestStringNulla {

	public static void main(String[] args) {
		String s = null;
		try {
		System.out.println(s.length());
	}
	catch(NullPointerException x) { 
		System.out.println("la stringa è vuota");
	}finally {
		System.out.println("bye bye");
		
	} 
	}
}