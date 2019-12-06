package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestWriteProp {

	public static void main(String[] args) {

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
			//prop.store(fos, "prima scrittura del file prop");
			prop.storeToXML(fos, "prima scrittura del file prop");
			fos.flush();
			fos.close();
		} catch (IOException e) {
			System.out.println("si sono verificati problemi durante la scrittura sul file properties" + e.getMessage());
		}
		
		
	}
}
