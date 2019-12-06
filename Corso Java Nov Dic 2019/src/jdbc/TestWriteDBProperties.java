package jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestWriteDBProperties {

	public static void main(String[] args) {
		
		final String nomefile = "db.properties";
		
		String nomedirectory = null;
		//ogetto di tipo file, un file vero e proprio che può anche essere una dir
		//stiamo creando oggetto di tipo file
		// così gli sto dicendo di cercarlo nella cartella test_IO?
		// il costruttore di file prende 2 param in ingresso
		File first_file = new File(nomedirectory , nomefile);
		File directory = new File(nomedirectory);
		
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
		Properties prop = new Properties ();
		
		Properties prop = new Properties ();

		File fileprop = new File(args[0]);
		FileOutputStream fos = null;

		//ricordati di mettere il nome del file di prop nei parametri che passi al main
		try {
			fos = new FileOutputStream (fileprop);
		} catch (FileNotFoundException e) {
			try {
				fileprop.createNewFile();
			} catch (IOException e1) {
				System.out.println("si sono verificati dei problemi durante la creazione del file di properties:" + e1.getMessage());
				System.exit(0);
			}
		}

		prop.setProperty("nome", "mauro");
		prop.setProperty("cognome", "bassan");
		prop.setProperty("auto", "bmw serie1");
		try {
			prop.store(fos, "prima scrittura del file prop");
			//prop.storeToXML(fos, "prima scrittura del file prop");
			fos.flush();
			fos.close();
		} catch (IOException e) {
			System.out.println("si sono verificati problemi durante la scrittura sul file properties" + e.getMessage());
		}

	}

}
