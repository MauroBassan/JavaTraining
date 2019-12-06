package base;

public class TestCiclo4Each {
	public static void main(String[] args) {
		String[] array1= new String[4];
		array1[0]="Matteo";
		array1[1]="Cristina";
		array1[2]="Paolo";
		array1[3]="Alessandro";
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1.length);
		
		for(String x:array1) {
			System.out.println(x);
		}
	}

}
