package inputOutput;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class TestDesktop {

	public static void main(String[] args) {
		
		final String nomeDirectory = "C:\\Users\\Begear\\Desktop";
		File directory = new File(nomeDirectory);
		
		File[] Desktop = directory.listFiles();
		
		int cartelle = 0;
		int file = 0;
		
		for(File elements : Desktop) {
			if(elements.isFile()) {
				System.out.print("File:\t\t");
				file++;
			}
			//File elements = null;
			if(elements.isDirectory()) {
				System.out.print("Directory:\t\t");
				cartelle++;
			}
			System.out.println(elements.getName());
		}
		System.out.println("\nTotal numbers of Files: " + file);
		System.out.println("Total numbers of Directory: " + cartelle);


}
}