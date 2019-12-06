package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCopyAbc {

	public static void main(String[] args) throws IOException {
		
		final String fileDaLeggere= "abc.txt";
		final String fileCopia ="copy_abc.txt";
		final String nomedirectory = "C:\\Users\\Begear\\Desktop\\TestIO";
		File file_copia = new File(nomedirectory, fileCopia);
		FileReader fr = null;
		int x;
		
		file_copia.createNewFile();
		
		try {
			//lui in FileReader vuole un oggetto come paramentro, e quindi inizializzo l'oggetto direttamente 
			//nelle parentesi anzichè metterlo in una nuova var
			fr= new FileReader(new File(nomedirectory , fileDaLeggere));
		} catch (FileNotFoundException e) {
			System.out.println("il file richiesto non è disponibile nel percorso specificato");
			System.exit(0);
		}
		
		FileWriter fw = new FileWriter(file_copia, true);
		
		while((x = fr.read()) != -1) 
		{
			System.out.print((char)x);
			fw.write(x);

		}
		fw.flush();
		fw.close();
		System.out.println("***COPIA TERMINATA***");
		
		System.out.println("esiste il file (" + fileCopia + ") ?: " +file_copia.exists());
	}

}