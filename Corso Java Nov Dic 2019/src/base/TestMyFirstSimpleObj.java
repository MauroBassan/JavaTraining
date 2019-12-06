package base;

public class TestMyFirstSimpleObj {

	public static void main(String[] args) {
		MyFirstSimpleObj mfso1 = new MyFirstSimpleObj();
		MyFirstSimpleObj mfso2 = new MyFirstSimpleObj();
		
		mfso1.bool1= true;
		mfso1.bool2= true;
		mfso1.variabile1= 100;
		mfso1.variabile2= 200;
		mfso1.nome= "Mauro";
		
		mfso1.metodo1();
		System.out.println("----------");
		mfso2.metodo1();
	}
}
