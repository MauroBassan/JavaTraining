package base;

public class TestMetodi {
	public static void main(String[] args) {
		
		//metodo senza params
		calcolaMetodo1();
		
		//metodo senza para ingr
		int val1=calcolaMetodo2();
		System.out.println("il metodo senza params in ingresso restituisce "
				+ "un intero del seguente valore: "+ val1);
		
		//metodo che passa un bool e ritorna un stringa
		String s=calcolaMetodo3(false);
		System.out.println("il metodo ritorna il seguente valore: "+s);
		
		//metodo che accetta più valori in ingresso
		calcolaMetodo4(10,20,'&',true,"Mauro");
				
		//metodo che accetta in ingresso un []
		int [] array1= {10,20,30,40,50};
		char[] array2= {'a','b','c'};
		calcolaMetodo5(array1,array2);	
		
		//metodo che ritorna un char[]
		char[] arc1= calcolaMetodo6(1,2,3,4,5);
		for(char x:arc1) System.out.println(x);
	}
	
	
	private static char[] calcolaMetodo6(int i, int j, int k, int l, int m) {
		char[] return_array=new char [5];
		return_array[i-1]='a';
		return_array[j-1]='b';
		return_array[k-1]='c';
		return_array[l-1]='d';
		return_array[m-1]='e';
		return return_array;
	}


	private static void calcolaMetodo5(int[] ar1, char[] ar2) {
		for(int i:ar1) System.out.println(i);
		for(char i:ar2) System.out.println(i);
	}


	private static void calcolaMetodo4(int i, int j, char c, boolean b, String s) {
		System.out.println("prima par:" + i);
		System.out.println("prima par:" + j);
		System.out.println("prima par:" + c);
		System.out.println("prima par:" + b);
		System.out.println("prima par:" + s);
		
	}
	
	
	private static String calcolaMetodo3(boolean b) {
		if(b==false) return "FALSO";
		else return "VERO";
	}

	private static int calcolaMetodo2(){
		return 10+20;
	}
	

	private static void calcolaMetodo1() {
		System.out.println("Io sono un metodo senza params");
	}
}

