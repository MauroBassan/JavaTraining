package eccezioni;

import java.io.*;

public class TestDivisioneThrows {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("inserire un numero");
		String s = br.readLine();
	}

}
