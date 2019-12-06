package modificatori;

public class I4Modificatori {
	
	private int a = 10;
	protected int b = 20;
	public int c= 30;
	int d = 40;

	private int getA() {
		return a;
	}

	private void setA(int a) {
		this.a = a;
	}

	protected int getB() {
		return b;
	}

	protected void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	int getD() {
		return d;
	}

	void setD(int d) {
		this.d = d;
	}
	
	public void stampa() {
	
		System.out.println(this.getA());
		System.out.println(this.getB());
		System.out.println(this.getC());
		System.out.println(this.getD());
	}	
	public void stampaReference() {
		System.out.println(this);
	}
}

