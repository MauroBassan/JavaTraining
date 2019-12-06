package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAuto {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, Exception, Throwable {
		Auto auto1 = new Auto("bmw", "serie1");
		
		// x vedere la classe di un oggetto:
//		String s = auto1.getClass().getName();
//		System.out.println(s);
//		System.out.println(Class.forName(s));
		
		// con l'oggetto Constructor che viene da reflection ottengo info di una classe e le metto in un array
		Constructor[] constructor = new Constructor[10];
		Field[] fields = new Field [10];
		Method[] metodi = new Method[10];
		
		constructor= auto1.getClass().getConstructors();
		System.out.println("Elenco public constructors:\n -------------------------------\n");
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
		}
		
		// con il metodo getDeclared... possiamo fare una deep inspection
		constructor= auto1.getClass().getDeclaredConstructors();
		System.out.println("Elenco DECLARED constructors:\n -------------------------------\n");
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
		}
		
		fields= auto1.getClass().getFields();
		System.out.println("Elenco public fields:\n -------------------------------\n");
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
//			if(fields[i].getName().equalsIgnoreCase("setDiesl")) {
//				fields[i].setAccessible(true);
//			}
		}
		
		fields= auto1.getClass().getDeclaredFields();
		System.out.println("Elenco DECLARED fields:\n -------------------------------\n");
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		
		metodi= auto1.getClass().getMethods();
		System.out.println("Elenco public methods:\n -------------------------------\n");
		for (int i = 0; i < metodi.length; i++) {
			System.out.println(metodi[i]);
		}
		
		metodi = auto1.getClass().getDeclaredMethods();
		System.out.println("METODO PUBLIC METH ALTERNATIVO:\n -------------------------------\n");
		for (int i = 0; i < metodi.length; i++) {
			System.out.println(metodi[i]);
			if(metodi[i].getName().equalsIgnoreCase("setDiesel")) {
				metodi[i].setAccessible(true);
				Object[] array = new Object [1];
				array[0] = true;
				System.out.println(auto1.getModello());
				metodi[i].invoke(auto1, array);
				System.out.println(auto1.getModello());
				
			}
			
			if(metodi[i].getName().equalsIgnoreCase("isDiesel")) {
				metodi[i].setAccessible(true);
				System.out.println(metodi[i].invoke(auto1));
				
			}
		}
		
		metodi= auto1.getClass().getDeclaredMethods();
		System.out.println("Elenco DECLARED methods:\n -------------------------------\n");
		for (int i = 0; i < metodi.length; i++) {
			System.out.println(metodi[i]);
		}
	}

}
