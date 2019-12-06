package interfacce;

public interface Volare {
	
	void decollo();
	void atterro();
	
	default void precipita() {
		System.out.println("non mi piace precipitare");
	}
	
	// il metodo statico 
	static void plana() {
		System.out.println("Plano solo in alta quota");
	}
}
