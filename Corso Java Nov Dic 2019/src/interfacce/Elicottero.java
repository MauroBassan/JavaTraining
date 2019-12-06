package interfacce;

public class Elicottero implements Volare {

	@Override
	public void decollo() {
		System.out.println("Decollo sempre in verticale");
		
	}

	@Override
	public void atterro() {
		System.out.println("Atterro sempre in verticale");
		
	}
	
	@Override
	public void precipita() {
		Volare.super.precipita();
		System.out.println("ma se lo faccio, lo faccio in linea verticale");

}
}
