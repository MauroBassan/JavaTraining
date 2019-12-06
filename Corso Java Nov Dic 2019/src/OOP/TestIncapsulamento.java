package OOP;

public class TestIncapsulamento {

	public static void main(String[] args) {
		Incapsulamento icps1 = new Incapsulamento();
		icps1.setNome("Mauro");
		icps1.setCognome("Bassan");
		System.out.println(icps1.getNome() + " " +icps1.getCognome());
		icps1.setNome("Pippo");
		System.out.println(icps1.getNome() + " "+ icps1.getCognome());

	}

}
