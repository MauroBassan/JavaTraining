package esercizio;

import eccezioni.AgeException;

public class Cinema {
	
	public Cinema () {
		
	}
	
	boolean xxx;
	
	public boolean isXxx() {
		return xxx;
	}

	public void setXxx(boolean xxx) {
		this.xxx = xxx;
	}
	public boolean controlloCinema(String x) {
		if(x.equalsIgnoreCase("y")) { this.setXxx(true);}
		else if (x.equalsIgnoreCase("n")) {this.setXxx(false);}
		return xxx;
	}
	
	public void metodoCheckAge(String nome, int age) throws AgeException {
		if (this.xxx==true) {
		if (age < 18) throw new AgeException (nome + "mi spiace ma sei minorenne!" + "("+age +")");
		else if (age > 90) throw new AgeException (nome + "mi sa che sei troppo grande per queste cose!" + "("+age+")");
		else {
			System.out.println("buona visione!");	}	
	}
	}
		
	public void metodoProgrammazione() {
			System.out.println("sono il metodo Programmazione");
	}

	public void metodoViewAll() {
			System.out.println("sono il metodo ViewAll");
		}

	public void metodoView() {
			System.out.println("sono il metodo View");
		}

	public void metodoCancella() {
			System.out.println("sono il metodo Cxl");
		}

	public void metodoModifica() {
			System.out.println("sono il metodo Modifica");
		}

	public void metodoPrenotazione() {
		
		
			System.out.println("sono il metodo Prenotazione");
			do {
				
				System.out.println("inserire nome: (digitare stop per uscire)" );
				this.setNome(sc.nextLine());
				if(this.getNome().equalsIgnoreCase("stop")) { 
					System.out.println("bye!"); break;
				}
				
				System.out.println("inserire l'età:");
				this.setAge(sc.nextInt());
				try {
					c1.metodoCheckAge(p1.getNome(),p1.getAge());
				} catch (AgeException e) {
					System.out.println(e.getMessage());
				}
				
				System.out.println("inserire un posto da 1 a 10:");
				this.setPosto(sc.nextInt());
				try {
					this.metodoCheckAge(p1.getNome(),p1.getAge());
				} catch (AgeException e) {
					System.out.println(e.getMessage());
				}
				}while(true);
			}
		}
	}