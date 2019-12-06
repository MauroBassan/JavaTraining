package inputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriteFile {

	public static void main(String[] args) throws IOException {
		
		final String nomefile = "abc.txt";
		final String nomedirectory = "C:\\Users\\Begear\\Desktop\\TestIO";
		
		//ogetto di tipo file, un file vero e proprio che può anche essere una dir
		//stiamo creando oggetto di tipo file
		// così gli sto dicendo di cercarlo nella cartella test_IO?
		// il costruttore di file prende 2 param in ingresso
		File first_file = new File(nomedirectory , nomefile);
		File directory = new File(nomedirectory);
		
		System.out.println("esiste la directory (" + nomedirectory + ") ? " +directory.exists());
		if (directory.exists() == false) directory.mkdir();
		
		System.out.println("esiste il file (" + nomefile + ") ? " +first_file.exists());
		if (first_file.exists() == false) first_file.createNewFile();
			//così gli dico di crearmi la dir che gli ho passato sopra, dove gli ho chiesto di cercare il file
		
		// il secondo param stabilisce se riscrivere file o se aggiungere, false=riscrive, true= aggiunge, di default è false
		FileWriter fw = new FileWriter(first_file, true);
		fw.write("ciao sono Mauro\n");
		fw.write("oggi non ho sonno\n");
		fw.write("magierò meglio\n");
		fw.flush();
		fw.close();
		System.out.println("***PROGRAMMA TERMINATO***");
	}
}
