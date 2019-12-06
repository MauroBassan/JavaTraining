package eccezioni;

import java.util.zip.DataFormatException;

import javax.management.BadAttributeValueExpException;

public class Calcolatrice {

	int somma(int a, int b) {
		return a+b;
	}
	
	int sottrazione(int a, int b) {
		return a-b;
	}
	
	int moltiplicazione(int a, int b) throws DataFormatException, BadAttributeValueExpException {
		//sto lanciando io l'eccezione, dico al programma: attenzione sto lanciando una eccezione che va gesita!!!
		// in TestCalcolatrice. moltiplicazione devo catchare l'eccezione lanciata!!! con il try/catch!!
		int result= a*b;
		if (result > 100 && result < 1000) throw new BadAttributeValueExpException("il risultato non può essere compreso tra 100 e 1000");
		if (result > 1000000) throw new DataFormatException("non è consenntito un risultato maggiore di 1mln");
		return a*b;
	}
	
	/**
	 * Questo metdo serve a calcolare la divisone fra 2 numeri e ritorna il valore divisione con il relativo resto.
	 * @param a primo operatore divisione
	 * @param b secondo operatore divisione
	 * @return un array di tipo int dove il primo elemento è il risultato della div, il secondo è il resto.
	 */
	int [] divisione(int a, int b) {
		
		int [] risultati = new int[2];
		
		risultati[0]=a/b;
		risultati[1]=a%b;
		
		return risultati;
	}
	
	//private int modulo(int a, int b) {
	//	return a%b;
	//}
}

