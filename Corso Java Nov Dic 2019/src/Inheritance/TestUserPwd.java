package Inheritance;

import java.util.Scanner;

public class TestUserPwd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digita EXIT per uscire");
		System.out.println("----------------------");

		do {
			System.out.println("digitare nome utente:");
			String user= sc.nextLine();
			if (user.contentEquals(args[0])) {
				System.out.println("digitare la password:");
			}
			else if(user.equalsIgnoreCase("exit")) {
				System.exit(0);
			}
			else { System.out.println("verifica il nome utente!!!");
			System.exit(0);
				}
			String pwd=sc.nextLine();
			if (pwd.contentEquals(args[1])) {
				System.out.println("password corretta");
				}
			else { System.out.println("verifica la psw!!!");
			System.exit(0);
			}			
	
		}while(true);
	}

}

