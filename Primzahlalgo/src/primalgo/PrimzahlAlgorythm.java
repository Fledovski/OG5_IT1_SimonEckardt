package primalgo;
import java.util.Scanner;

public class PrimzahlAlgorythm {

	
	public static void main(String[] args) {
		long zahl;
		System.out.println("Welche Zahl wollen sie überprüfen lassen?");
		Stoppuhr stoppuhrTest = new Stoppuhr();		
		 Scanner scooper = new Scanner(System.in);
		 zahl = scooper.nextLong();
		 stoppuhrTest.starten();
		 Primzahlen primzahlenTest = new Primzahlen();
		 System.out.println(primzahlenTest.istPrim(zahl));
		 stoppuhrTest.stoppen();
		 System.out.println("\nDies hat " + stoppuhrTest.getVergangeneZeit() + " Milisekunden gebraucht.");
		 stoppuhrTest.reset();
	}

}
