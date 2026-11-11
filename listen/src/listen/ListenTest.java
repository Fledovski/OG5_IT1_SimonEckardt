package listen;

import java.util.Scanner;

public class ListenTest {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Geben sie die Zahl an mit der gesucht werden soll");
		long suche = input.nextLong();
		System.out.println("Wie lang soll die Liste sein?");
		int laenge = input.nextInt();
		System.out.println("\n Welches Verfahren möchtest du benutzen? \n 1 = Lineare Suche");
		short verfahren = input.nextShort();
		Timer.starten();
		if (verfahren == 1) {
			System.out.println("\n Die Zahl liegt am Index:" + LineareSuche.lineareSuche(suche, Listengenerator.getSortedList(laenge)));				
		} else if (verfahren == 2) {
			
		}
		Timer.stoppen();
		System.out.println("\nDies hat " + Timer.getVergangeneZeit() + "ms gebraucht");
	}
}
