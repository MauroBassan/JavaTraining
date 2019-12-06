package generics;

import java.util.ArrayList;

public class TestArrayListSenzaGenerics {

	public static void main(String[] args) {
		
		ArrayList nomi = new ArrayList();
		
		nomi.add("Vanni");
		nomi.add("Matilde");
		nomi.add("Mauro");
		//nomi.add(11);
		
		String s = null;
		
		for (int i = 0; i < nomi.size(); i++) {
			if(nomi.get(i) instanceof String) {
				s=(String) nomi.get(i);
				System.out.println(s);
			}
			//System.out.println(nomi.get(i));
	}

}
}
