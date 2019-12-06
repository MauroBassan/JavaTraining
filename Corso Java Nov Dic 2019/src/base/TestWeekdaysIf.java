package base;

public class TestWeekdaysIf {
	public static void main(String[]args) {
		int x;
		x=3;
		if (x==1) {
			System.out.println("lunedì");

			if(x==2) {
				System.out.println("martedì");
			}
			if(x==3) {
				System.out.println("mercoledì");
			}
			if(x==4) {
				System.out.println("giovedì");
			}
			if(x==5) {
				System.out.println("venerdì");
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
