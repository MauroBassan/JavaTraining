package interfacce;

public class ElicotteroDaGuerra implements Volare, Bombardare {

	@Override
	public void caricareLeArmi() {
		System.out.println("Carica mitragliatrice in cabina");
	}

	@Override
	public void prendereLaMiraESparare() {
		System.out.println("Utilizza soldato per l'azione");
		
	}

	@Override
	public void decollo() {
		System.out.println("Decollo sempre in verticale");
		
	}

	@Override
	public void atterro() {
		System.out.println("Atterro sempre in verticale");
		
	}

}
