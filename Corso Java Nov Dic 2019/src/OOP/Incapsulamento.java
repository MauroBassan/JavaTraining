package OOP;

public class Incapsulamento {

	private String nome;
	private String cognome;

	public void setNome(String variabile) {
		if (variabile.equals("Pippo")) {
			System.out.println("not valid");
		}else this.nome= variabile;
		
		this.nome=variabile;

	}

	public void setCognome (String variabile) {
		this.cognome=variabile;
	}

	public String getNome() {
		return this.nome;
	}
	public String getCognome() {
		return this.cognome;
	}
}

