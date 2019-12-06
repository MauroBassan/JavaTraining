package OOP;

public class TestEquals {

	public static void main(String[] args) {
		Incapsulamento p1 = new Incapsulamento();
		p1.setNome("Mauro");
		p1.setCognome("Bsn");
		
		Incapsulamento p2 = new Incapsulamento();
		p2.setNome("Mauro");
		p2.setCognome("Bsn");
		
		System.out.println(p1.getNome().equalsIgnoreCase(p2.getNome()));
		
	}

}
