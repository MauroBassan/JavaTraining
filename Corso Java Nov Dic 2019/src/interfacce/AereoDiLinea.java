package interfacce;

public class AereoDiLinea implements Volare {

	@Override
	public void decollo() {
		System.out.println("Ho bisogno sempre di un aeroporto di notevoli dimensioni");
		
	}

	@Override
	public void atterro() {
		System.out.println("Dopo l'atterraggio scatta l'applauso");
		
	}

		
}
