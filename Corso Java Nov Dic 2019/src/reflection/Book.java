package reflection;

public class Book {

	private String titolo;
	private String autore;
	private int price;
	//fare get e set pvt
	private int discount;
	
	public Book(String titolo, String autore, int price) {
		this.setTitolo (titolo);
		this.setAutore (autore);
		this.setPrice (price);
		//this.setDiscount (discount);
	}
	
	private Book() {
		System.out.println(" io solo il costruttore privato");
		}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public int getPrice() {
		return price - getDiscount();
	}
	
	public void setPrice(int price) {
		if(this.getAutore().equalsIgnoreCase("marvel")) {
			 setDiscount(3);
	}
		this.price =price;
	}
	
	private int getDiscount() {
		return discount;
	}
	private void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public String toString() {
		return "Book [Titolo=" + this.getTitolo() + ", Autore=" + this.getAutore() + ", Prezzo=" + this.getPrice() +" ]";
	}
	
//	public void metodoPreferiti() {
//		 if(this.getAutore().equalsIgnoreCase("marvel")) {
//			 this.setDiscount(20);
//		 }
//	 }
}
