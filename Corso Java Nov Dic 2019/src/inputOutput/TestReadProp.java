package inputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestReadProp {

	public static void main(String[] args) {
		
		Properties prop = new Properties ();
		
		File fileprop = new File(args[0]);
		// 2 modi differenti di fare la stessa cosa.
		//File fileprop = new File("config.properties");
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

}
