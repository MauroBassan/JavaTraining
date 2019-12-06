package Inheritance;

public class Moto extends MezzoDiTrasportoStradale{

	private int ruote;
	boolean sidecar=false;

	public Moto(String marca, String modello, String tipo,int ruote, boolean sidecar) {
		super(marca, modello, tipo);
		this.setRuote(ruote);
		this.setSidecar(sidecar);
	}

	@Override
	public boolean Inpenna() {
		if(this.ruote==2) {return true;
		}
		else { return false;
		}

	}

	public int getRuote() {
		return ruote;
	}
	public void setRuote(int ruote) {
		this.ruote = ruote;
	}
	public boolean isSidecar() {
		return sidecar;
	}
	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

	@Override
	public String toString() {
		
			return "MezzoDiTrasportoStradale [Marca=" + this.getMarca() + ", Modello=" + this.getModello() + ", Tipo=" + this.getTipo() + " Ruote=" + this.getRuote() + " Sidecar=" + this.isSidecar() +  " ]";
		}
	}

