package Inheritance;

import interfacce.Dimensionare;

public class Auto extends MezzoDiTrasportoStradale implements Dimensionare{
	
	private int porte;
	private int posti;

	public Auto(String marca, String modello, String tipo, int porte, int posti) {
		super(marca, modello, tipo);
		this.setPorte(porte);
		this.setPosti(posti);
		//this.calcolaArea(x, y);
	}

	
	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	@Override
	public double calcolaArea(double a, double b) {
		return (a*b);
	}

	@Override
	public double calcolaVolume(double a, double b, double c) {
		return (a*b*c);
	}

	@Override
	public String toString() {
		return "MezzoDiTrasportoStradale [Marca=" + this.getMarca() + ", Modello=" + this.getModello() + ", Tipo=" + this.getTipo() + " Porte=" + this.getPorte() + " Posti=" + this.getPosti() + " area: " + this.calcolaArea(2,2) + " volume: " +this.calcolaVolume(2, 2, 2) +" ]";
	}


	@Override
	boolean Inpenna() {
		return false;
	}


}
