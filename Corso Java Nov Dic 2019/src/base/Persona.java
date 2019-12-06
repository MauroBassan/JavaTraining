package base;

public class Persona {
	String nome;
	String cognome;
	char sesso;
	String dob;


	public Persona(String n, String c, char s, String date) {
		nome= n;
		cognome= c;
		sesso= s;
		dob= date;
	}
	
	public void stampa() {
		
		System.out.println("mi chiamo "+nome +" " +sesso+  " " + cognome +", nato il " +dob);
	}
}

