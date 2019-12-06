package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestCopyFileToArrayList {

	public static void main(String[] args) throws IOException {
		
		final String nomefile = "abc.txt";
		final String nomeDirectory = "C:\\Users\\Begear\\Desktop\\TestIO";
		ArrayList <Character> lista = new ArrayList<>();
		int x;
		
		FileReader fr= new FileReader(new File(nomeDirectory , nomefile));
		//fino al while è lettura!!!
		while((x = fr.read()) != -1) {
		
		// aggiungo quello che leggo all'arraylist
		lista.add((char)x);	
		}
		
		// stampa tutto quello che legge, psazi inclusi!
		for(int i = 0; i< lista.size(); i++) {
			System.out.print(lista.get(i));

}
}}
