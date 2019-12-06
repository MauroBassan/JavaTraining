package interfacce;

public class TestVolare {
	
	public static void main(String[] args) {
	Elicottero eli = new Elicottero();
	AereoDiLinea aereo = new AereoDiLinea();
	ElicotteroDaGuerra edg = new ElicotteroDaGuerra();
	
	eli.decollo();
	eli.atterro();
	eli.precipita();
	Volare.plana();
	System.out.println("***************");
	edg.decollo();
	edg.caricareLeArmi();
	edg.prendereLaMiraESparare();
	edg.atterro();
	System.out.println("***************");
	aereo.decollo();
	aereo.atterro();

}
}

