package Inheritance;

public abstract class MezzoDiTrasportoStradale {
	
	private String Marca;
	private String Modello;
	private String Tipo;
	
	public MezzoDiTrasportoStradale(String marca, String modello, String tipo) {
		Marca = marca;
		Modello = modello;
		Tipo = tipo;
	}
	
	
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModello() {
		return Modello;
	}
	public void setModello(String modello) {
		Modello = modello;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	abstract boolean Inpenna();
	
	public abstract String toString();
	
	
}
