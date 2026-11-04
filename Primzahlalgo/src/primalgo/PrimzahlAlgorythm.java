package primalgo;
import java.util.Scanner;

public class PrimzahlAlgorythm {

	
	public static void main(String[] args) {
		long zahl;
		System.out.println("Welche Zahl wollen sie überprüfen lassen?");
		
		 Scanner scooper = new Scanner(System.in);
		 zahl = scooper.nextLong();
		 Primzahlen primzahlenTest = new Primzahlen();
		 System.out.println(primzahlenTest.istPrim(zahl));
	}

}
