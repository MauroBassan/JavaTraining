package inputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TestCreaNuovoFile {

	public static void main(String[] args) throws IOException {
		String nomefile = null;
		String nomedirectory;

		Scanner sc = new Scanner(System.in);


		//boolean dot=false;
		boolean controllo=false;

		while(controllo) {
		System.out.println("inserisci il nome del file che vuoi creare:");

		nomefile = sc.nextLine();

		for(int i = 0; i< nomefile.length(); i++) {
			if(nomefile.charAt(i) == '.') {
				System.out.println("il carattere . (punto) non è valido!");
				controllo = true;	
			}
		}}
		System.out.println ("inserisci la cartella di destinazione del tuo nuovo file:");
		nomedirectory = "C:\\Users\\BeGear\\Desktop"+sc.nextLine();

		//System.out.println ("inserisci la cartella di destinazione del tuo nuovo file:");
		//nomedirectory = "C:\\Users\\BeGear\\Desktop"+sc.nextLine();

		//ogetto di tipo file, un file vero e proprio che può anche essere una dir
		//stiamo creando oggetto di tipo file
		// così gli sto dicendo di cercarlo nella cartella test_IO?
		File first_file = new File(nomedirectory, nomefile+".txt");
		File directory = new File(nomedirectory);


		//System.out.println("esiste il file (" + nomedirectory + ") ? " +directory.exists());
		if (directory.exists() == false) {
			directory.mkdir();
		}

		//System.out.println("esiste il file (" + nomefile + ") ? " +first_file.exists());

		if (first_file.exists() == false) {
			//così gli dico di crearmi la dir che gli ho passato sopra, dove gli ho chiesto di cercare il file
			first_file.createNewFile();

		}

		//		if(first_file.exists() == false) first_file.createNewFile();
		System.out.println("esiste il file (" + nomefile + ") ? " +first_file.exists());
		System.out.println("esiste il file (" + nomedirectory + ") ? " +directory.exists());


		do {
			System.out.println("inserisci il testo, digita SAVE x terminare");
			String testofile = sc.nextLine();
			if(testofile.equalsIgnoreCase("save")) {
				break;
			}

			FileWriter fw = new FileWriter(first_file, true);
			// così andiamo a capo alla fine di ogni riga, cioè dopo l'invio, dopo il nextLine.
			fw.write(testofile + "\n");
			fw.flush();
			fw.close();
		}while(true);


		System.out.println("***PROGRAMMA TERMINATO***");

	
}
}