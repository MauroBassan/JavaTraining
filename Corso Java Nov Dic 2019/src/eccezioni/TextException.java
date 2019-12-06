package eccezioni;

import java.util.Scanner;

public class TextException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("quanti elementi contiene l'array?");
		int x = sc.nextInt();
		int [] numeri = new int [x];
		System.out.println("array composto da " + x + " elementi");

		try {
		for (int i = 0; i < x + 1; i++) {
			numeri[i]=i;
			System.out.println(numeri[i]);
		} } catch (IndexOutOfBoundsException e) {
			System.out.println("superato il limite array");
		}
	}
}