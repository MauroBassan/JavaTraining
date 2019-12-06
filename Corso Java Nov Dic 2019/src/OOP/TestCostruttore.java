package OOP;

public class TestCostruttore {

	int x;
	
	public TestCostruttore() {
		System.out.println("io sono il costruttore");
		//verifica indirizzo memoria
		System.out.println(this);
		System.out.println(x);
		this.metodo1();
	}

	public static void main(String[]args) {
		System.out.println("ciao");
		TestCostruttore tc = new TestCostruttore();
		tc.metodo1();
		//verifica indirizzo di mem uguale al (this)
		System.out.println(tc);
	}
	
	public void metodo1() {
		System.out.println("io sono il metodo1");
		this.x = 20;
		System.out.println(x);
		
		for(int y = 0; y < 10; y++) {
			System.out.println("io sono y e valgo " + y);
			int k = 0;
			k= k + y;
			System.out.println("io sono k e valgo " + k);
		}
	}
}
