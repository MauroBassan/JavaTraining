package base;

public class TestDataEsempio {

	public static void main(String[] args) {
		DataEsempio de1= new DataEsempio();
		DataEsempio de2=new DataEsempio(1985);
		DataEsempio de3=new DataEsempio(14,5);


		System.out.println("data dell'oggetto de1:"+ de1.giorno + "." + de1.mese + "." + de1.anno);
		System.out.println("data dell'oggetto de2:"+ de2.giorno + "." + de2.mese + "." + de2.anno);
		System.out.println("data dell'oggetto de3:"+ de3.giorno + "." + de3.mese + "." + de3.anno);


	}
}
