package inputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class TestGestioneFileProp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("* Gestione File Properties *\nseleziona operazione da eseguire: \n"+
		"1. Inserimento \n2. Lettura \n3. Uscita");
		
		int scelta = sc.nextInt();
		
		switch(scelta) {
			case 1:
				metodoCreaFile();
				break;
			case 2: metodoLettura();
				break;
			case 3: 
				System.out.println("arrivederci!");
				System.exit(0);
			default: 
				System.out.println("le scelte sono solo 3!");
		}
		
		

	}

	private static void metodoLettura() {
		Properties prop = new Properties ();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("digitare il nome del file da leggere:");
		String filecercato = sc.nextLine();
		
		File fileprop = new File(filecercato);
		
		if (fileprop.exists() == false) {
			System.out.println("il file non esiste!");
			System.out.println("vuoi crearlo? digita: \ny per confermare oppure \nx per uscire!");
			String yorn = sc.nextLine();
			
				if(yorn.equalsIgnoreCase("y")) 
					metodoCreaFile();
				else if (yorn.equalsIgnoreCase("n")) {
					System.exit(0);
				}
			}
		
		FileInputStream fis = null;
		
		try {
			// qua gli dico aprimi uno stream verso fileprop e caricali nell'oggeto di tipo Properties
			fis = new FileInputStream (fileprop);
			prop.load(fis);
			
			//String s = (String) prop.get("4");
			//System.out.println(s);
			
			for (Object x : prop.keySet()) {
				System.out.println("key: " + x + "value: " + prop.getProperty((String) x));
			}
			
			} catch ( IOException e) {
			System.out.println("si sono verificati dei problemi durante la lettura del file di Properties" + e.getMessage());
			System.exit(0);
			} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("si sono verificati dei problemi durante la lettura del file di Properties" + e.getMessage());
				System.exit(0);
			}
		}
		}
	

	private static void metodoCreaFile() {
		
		Properties prop = new Properties ();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digitare il nome del file da inserire:");
		
		String nomefile = sc.nextLine();
		File fileprop = new File(nomefile +".config");
		
		if (fileprop.exists() == false) {
			try {
				fileprop.createNewFile();
			} catch (IOException e2) {
				System.out.println("si è verificato un errore durante la creazione del file."+ e2.getMessage());
			}
		
		FileOutputStream fos = null;
		do {
		System.out.println("inserire la chiave da registrare:");
		String key = sc.nextLine();
		try {
			fos = new FileOutputStream (fileprop);
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		}
//		 fileprop.createNewFile();
		System.out.println("inserire il valore della chiave:");
		String valore = sc.nextLine();
		prop.setProperty(key, valore);
		System.out.println("Vuoi continuare l'inserimento? Si/No");
		} while(sc.nextLine().equalsIgnoreCase("si"));
		//long start = System.nanoTime();
		
			try {
				prop.store(fos,"");
				fos.flush();
				fos.close();
			} catch (IOException e) {
				System.out.println("si sono verificati problemi durante la scrittura sul file properties" + e.getMessage());
			}
			
			
//		} catch (IOException e) {
//			System.out.println("si sono verificati problemi durante la scrittura sul file properties" + e.getMessage());
//		}
		
		
	}

}

//	private static boolean siNo() {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("continuare inserimento?\ny: prosegue \nn: exit");
//		String scelta = sc.nextLine();
//		
//		do{
//			if(scelta.equalsIgnoreCase("y")) 
//			return true;
//		
//		else if (scelta.equalsIgnoreCase("n")) 
//			System.out.println("* fine iserimento *");
//			return false;
//			
//	} while (true);
}



