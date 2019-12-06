package base;

import java.util.Scanner;

public class TestSwitchGiornoMeseAnno {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digita giorno...");
		int x = sc.nextInt(); sc.nextLine();
		System.out.println("digita mese...");
		int y = sc.nextInt(); sc.nextLine();
		System.out.println("digita anno...");
		int z = sc.nextInt(); sc.nextLine();
		sc.close();
		System.out.println(TestCondizioneSwitch.calcolaGiorno(x)+"\n" +TestCondizioneSwitch.calcolaMese(y)+"\n"+calcolaAnno(z));
}
	
	private static String calcolaAnno(int z) {
		String anno;
		switch(z%4) {
				
		case 0: anno="bisestile";
			break;
		default:
			anno="normale";
		}
		return anno;
	}
}

