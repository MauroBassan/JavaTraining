package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestBook {

	public static void main(String[] args) {
		
		Book book1 = new Book ("vendicatori", "marvel", 5);
		Book book2 = new Book ("xmen", "marvel", 10);
		Book book3 = new Book ("greenlantern", "dccomics", 5);
		
		Constructor[] constructor = new Constructor[10];
		Field[] fields = new Field [10];
		Method[] metodi = new Method[10];
		
		constructor= book1.getClass().getConstructors();
		System.out.println("Elenco public constructors:\n -------------------------------");
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
		}
		
		// con il metodo getDeclared... possiamo fare una deep inspection
		constructor= book1.getClass().getDeclaredConstructors();
		System.out.println("Elenco DECLARED constructors:\n -------------------------------");
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
		}
		
		fields= book1.getClass().getFields();
		System.out.println("Elenco public fields:\n -------------------------------");
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		
		fields= book1.getClass().getDeclaredFields();
		System.out.println("Elenco DECLARED fields:\n -------------------------------");
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		
		metodi= book1.getClass().getMethods();
		System.out.println("Elenco public methods:\n -------------------------------");
		for (int i = 0; i < metodi.length; i++) {
			System.out.println(metodi[i]);
		}
		
		metodi= book1.getClass().getDeclaredMethods();
		System.out.println("Elenco DECLARED methods:\n -------------------------------");
		for (int i = 0; i < metodi.length; i++) {
			System.out.println(metodi[i]);
		}

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		//book1.getPrice();
	}

}
