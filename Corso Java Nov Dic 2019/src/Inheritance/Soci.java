package Inheritance;

import java.util.Scanner;

public class Soci {

	private String psw="1234";
	private static int id_socio=1;
	private static int perc;
	private int id;
	private String nome;
	private String dataIscrizione;
	private int canone;
	private int sconto;

	public Soci(String nome, String dataIscrizione, int canone) {
		this.setNome(nome);
		this.setDataIscrizione(dataIscrizione);
		this.setCanone(canone);
		this.id=id_socio;
		id_socio++;

	}

	public Soci(String nome, String dataIscrizione, int canone, int perc) {
		this(nome, dataIscrizione, canone);
		this.sconto = setSconto(perc);
		}

	public static int getId_socio() {
		return id_socio;
	}

	public static void setId_socio(int id_socio) {
		Soci.id_socio = id_socio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSconto() {
		return this.sconto;
	}

	public int setSconto(int perc) {
		return this.sconto = perc;
	}


	public String getNome() {
		return this.nome;
	}


	public void setNome(String x) {
		this.nome = x;
	}


	public String getDataIscrizione() {
		return this.dataIscrizione;
	}


	public void setDataIscrizione(String y) {
		this.dataIscrizione = y;
	}


	public int getCanone() {
		return this.canone;
	}


	public void setCanone(int z) {
		this.canone = z;
	}

	public void registrazione() {

	}

	public void metodoStampa() {
		System.out.println("ID: " + this.getId());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Iscrizione: " + this.getDataIscrizione());
		System.out.println("Quota: " + this.getCanone());
		if (this.getSconto() !=0) System.out.println("Sconto: " + this.getSconto());
		
	}

	/*public void checkPassword() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("per proseguire è necessario inserire la password:");
			String pwd= sc.nextLine();
			if (pwd.equalsIgnoreCase(psw)) {
				metodoSconto();
			}

			else { System.out.println("Password errata!");
			System.exit(0);
				}
		}while(true);
	}*/

	public void metodoIscrizione() {
		metodoStampa();
		Scanner sc = new Scanner(System.in);
		System.out.println("sconto applicabile?");
		String yn= sc.nextLine();
		if(yn.equalsIgnoreCase("y")) {
			System.out.println("per inserire lo sconto immettere la password:");
			String pwd= sc.nextLine();
			if (pwd.equalsIgnoreCase(psw)) {
				System.out.println("inserire sconto:");
				int perc= sc.nextInt();
				System.out.println("Sconto applicato: " + perc);
				System.out.println("---------------------");
			}else { System.out.println("Password errata!");
			System.exit(0);
			}

			
			}

		}

	/*public int calcolaTassaIscrizione(final int inflazione) {
		
	}*/
}

