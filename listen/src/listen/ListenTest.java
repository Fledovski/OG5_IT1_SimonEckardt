package listen;

import java.util.Scanner;

public class ListenTest {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Geben sie die Zahl an mit der gesucht werden soll");
		int suche = input.nextInt();
		System.out.println("Wie lang soll die Liste sein?");
		int laenge = input.nextInt();
		System.out.println("\n Welches Verfahren möchtest du benutzen? \n 1 = Lineare Suche \n 2 = Interpolations Suche");
		short verfahren = input.nextShort();
		Timer.starten();
		if (verfahren == 1) {
			System.out.println("\n Die Zahl liegt am Index:" + LineareSuche.lineareSuche(suche, Listengenerator.getSortedList(laenge)));				
		} else if (verfahren == 2) {
			System.out.println("\n Die Zahl liegt am Index:" + InterpolationsSuche.interpolationsSuche(suche, Listengenerator.getSortedList(laenge)));
		} else {
			System.out.println("Kein gültiges Verfahren wurde Ausgewählt");
		}
		Timer.stoppen();
		System.out.println("\nDies hat " + Timer.getVergangeneZeit() + "ms gebraucht");
}
}
