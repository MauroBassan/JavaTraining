package base;

public class TestCondizioneSwitch {
	
		
	public static String calcolaGiorno(int x) {
		String giorno;
	
		
		switch (x) {
		case 1:
			giorno="lunedì";
			break;
		case 2:
			giorno="martedì";
			break;
		case 3:
			giorno="mercoledì";
			break;
		case 4:
			giorno="giovedì";
			break;
		case 5:
			giorno="venerdì";
			break;
		case 6:
			giorno="sabato";
			break;
		case 7:
			giorno="domenica";
			break;
		default:
			giorno="il giorno non esiste";
		}
		return giorno;
		}
	
	
		public static String calcolaMese(int y) {
			String mese;
			
			switch (y) {
			case 1:
				mese="gennaio";
				break;
			case 2:
				mese="febbraio";
				break;
			case 3:
				mese="marzo";
				break;
			case 4:
				mese="aprile";
				break;
			case 5:
				mese="maggio";
				break;
			case 6:
				mese="giugno";
				break;
			case 7:
				mese="luglio";
				break;
			case 8:
				mese="agosto";
				break;
			case 9:
				mese="settembre";
				break;
			case 10:
				mese="ottobre";
				break;
			case 11:
				mese="novembre";
				break;
			case 12:
				mese="dicembre";
				break;
			default:
				mese="i mesi sono 12";
			}
			return mese;
	}

}
