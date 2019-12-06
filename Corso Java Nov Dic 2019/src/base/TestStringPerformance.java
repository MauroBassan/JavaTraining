package base;

public class TestStringPerformance {

	public static void main(String[] args) {
		
		String string= "ciao";
		StringBuilder stringbuilder = new StringBuilder("ciao");
		StringBuffer stringbuffer = new StringBuffer("ciao");
		long start,end;
		
		
		start = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			string = (string + 1);
			//System.out.println(string);
		}
		end= System.nanoTime();
		System.out.println("stringa: " + (end-start));
		
		
		start = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			stringbuilder.append(i);
			//System.out.println(stringbuilder);
		}
		end= System.nanoTime();
		System.out.println("stringbuilder: " + (end-start));

		
		start = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			stringbuffer.append(i);
			//System.out.println(stringbuffer);
		}
		end= System.nanoTime();
		System.out.println("stringbuffer: " + (end-start));
	}
	
	}


