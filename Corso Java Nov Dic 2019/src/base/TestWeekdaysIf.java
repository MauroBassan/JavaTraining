package base;

public class TestWeekdaysIf {
	public static void main(String[]args) {
		int x;
		x=3;
		if (x==1) {
			System.out.println("luned�");

			if(x==2) {
				System.out.println("marted�");
			}
			if(x==3) {
				System.out.println("mercoled�");
			}
			if(x==4) {
				System.out.println("gioved�");
			}
			if(x==5) {
				System.out.println("venerd�");
			}
			if(x==6) {
				System.out.println("sabato");
			}
			if(x==7) {
				System.out.println("domenica");
			}
		}else {
			System.out.println("la settimana ha sette giorni!");
		}
	}}
