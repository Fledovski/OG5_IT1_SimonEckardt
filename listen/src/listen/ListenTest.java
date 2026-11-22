package listen;

import java.util.Scanner;

public class ListenTest {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Erstellt eine Scanner Instanz
		System.out.println("Geben sie die Zahl an mit der gesucht werden soll");
		int suche = input.nextInt();
		System.out.println("Wie lang soll die Liste sein?");
		int laenge = input.nextInt();
		int[] a = Listengenerator.getSortedList(laenge); //Erstellt die Liste mithilfe des Listengenerators
		System.out.println("\n Welches Verfahren moechtest du benutzen? \n 1 = Lineare Suche \n 2 = Interpolations Suche");
		short verfahren = input.nextShort();
		Timer.starten(); //startet Timer
		if (verfahren == 1) { //if else verfahren um Suchverfahren auszuewaehlfen
			System.out.println("\n Die Zahl liegt am Index:" + LineareSuche.lineareSuche(suche, a));				
		} else if (verfahren == 2) {
			System.out.println("\n Die Zahl liegt am Index:" + InterpolationsSuche.interpolationsSuche(suche, a));
		} else {
			System.out.println("Kein gueltiges Verfahren wurde Ausgewaehlt");
		}
		Timer.stoppen(); //stoppt Timer
		System.out.println("\nDies hat " + Timer.getVergangeneZeit() + "ms gebraucht"); //Gibt die Gebrauchte Zeit an
}
}
