package eccezioni;

public class Persona {
	
	private String nome;
	private int age;
	private int posto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPosto() {
		return posto;
	}

	public void setPosto(int posto) {
		this.posto = posto;
	}

	public String toString() {
		
		return "Persona [nome=" + this.getNome() + ", age=" + this.getAge() + ", posto= " + this.getPosto() +"]";
	}
}