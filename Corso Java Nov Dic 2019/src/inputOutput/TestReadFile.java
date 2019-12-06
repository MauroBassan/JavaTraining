package inputOutput;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.sound.midi.SysexMessage;

public class TestReadFile {

	public static void main(String[] args) throws IOException  {
		
		final String nomefile = "abc.txt";
		final String nomedirectory = "C:\\Users\\Begear\\Desktop\\TestIO";
		FileReader fr = null;
		int x;
		
//		if (first_file.exists() == false) {
//				System.out.println(" il file richiesto non è disponibile nel percorso specificato");
//				System.exit(0);
//		}
		
		try {
			//lui in FileReader vuole un oggetto come paramentro, e quindi inizializzo l'oggetto direttamente 
			//nelle parentesi anzichè metterlo in una nuova var
			fr= new FileReader(new File(nomedirectory , nomefile));
		} catch (FileNotFoundException e) {
			System.out.println(" il file richiesto non è disponibile nel percorso specificato");
			System.exit(0);
		}
		
		//legge il contenuto fino alla fine, ovvero al -1.
		while((x = fr.read()) != -1) {
		System.out.print((char)x);
	}
}
}
