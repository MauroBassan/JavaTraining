package generics;

public class KeyValue <K1, K2> {
	
	public KeyValue() {
		
	}
	
	public KeyValue (K1 k1, K2 k2) {
		this.setK1(k1);
		this.setK2(k2);
	}
	
	public KeyValue (K1 k1) {
		this.setK1(k1);
	}

	private K1 k1;
	private K2 k2;
	
	public K1 getK1() {
		return k1;
	}
	public void setK1(K1 k1) {
		this.k1 = k1;
	}
	public K2 getK2() {
		return k2;
	}
	public void setK2(K2 k2) {
		this.k2 = k2;
	}
	
	@Override
	public String toString() {
		return ("("+ this.getK1().getClass().getSimpleName() + this.k1  + ")" + "("+this.getK2().getClass().getSimpleName() + this.k2 +")");	
	}	
}
