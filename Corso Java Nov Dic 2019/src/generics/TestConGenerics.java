package generics;

public class TestConGenerics {

	public static void main(String[] args) {
		
		int x;
		double y;
		
		x = 10;
		y = 12.5;
		
		CoppiaGenerics<Integer, Double> cg1 = new CoppiaGenerics<>();
		cg1.setT1(x);
		cg1.setT2(y);		
		System.out.println(cg1.getT1() + " " + cg1.getT2());
		
		
		CoppiaGenerics<Float, Boolean> cg2 = new CoppiaGenerics<>();
		cg2.setT1(14.258f);
		cg2.setT2(false);
		System.out.println(cg2.getT1() + " " + cg2.getT2());
	}

}
