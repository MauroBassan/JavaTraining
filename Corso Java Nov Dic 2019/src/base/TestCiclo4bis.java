package base;

public class TestCiclo4bis {
	public static void main(String[]args) {

		for(int i=0; i<=100; i++ ) {
			if (i >=20 && i<=50) continue;
			if (i >=75)break;
			System.out.println("il valore di i è:" + i);
			if (i%2==0) System.out.println(">>>ok");
		}
		
		System.out.println("***ENDOF4***");
}


}
