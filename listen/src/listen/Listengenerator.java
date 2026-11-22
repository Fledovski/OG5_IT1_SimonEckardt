package listen;

import java.util.Random;

public class Listengenerator {

	public static int[] getSortedList(int laenge){
		Random rand = new Random(111111);
		int[] zahlenliste = new int[laenge];
		int naechsteZahl = 0;
		
		for(int i = 0; i < laenge; i++){
			naechsteZahl += rand.nextInt(3)+1;
			zahlenliste[i] = naechsteZahl;
		}
		
		return zahlenliste;
	}
}