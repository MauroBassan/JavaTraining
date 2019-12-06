package generics;

public class TestSenzaGenerics1 {

	public static void main(String[] args) {
		
		int x;
		double y;
		
		CoppiaIntDouble cid1 = new CoppiaIntDouble();
		
		x=10;
		y=12.5;
		
		cid1.setX(x);
		cid1.setY(y);
		
		System.out.println(cid1.getX() + " " + cid1.getY());
		
		CoppiaIntDouble cid2 = new CoppiaIntDouble();
		
		x=111;
		cid2.setX(x);
		x=222;
		cid2.setY(x);
		
		System.out.println(cid2.getX() + " " + cid2.getY());
		
		
		CoppiaBooleanFloat cbf = new CoppiaBooleanFloat();
		cbf.setB(false);
		cbf.setF(100.25f);
		
		System.out.println(cbf.isB() + " " + cbf.getF());
	}

}
