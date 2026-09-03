package calc;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class TaschenrechnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner = new Scanner(System.in);
		Taschenrechner ts = new Taschenrechner();
		
		double zahl1;
		double zahl2;
		
		int swValue;

		// Display menu graphics
		System.out.println("============================");
		System.out.println("|   MENU SELECTION DEMO    |");
		System.out.println("============================");
		System.out.println("| Options:                 |");
		System.out.println("|        1. Addieren       |");
		System.out.println("|        2. Subtrahieren   |");
		System.out.println("|        3. Multiplizieren |");
		System.out.println("|        4. Dividieren     |");
		System.out.println("|        5. Exit           |");
		System.out.println("============================");
		System.out.print(" Select option: ");
		swValue = myScanner.next().charAt(0);

		// Switch construct
		switch (swValue) {
		case '1':
			System.out.println("Bitte geben Sie den 1. Summanden an");
			zahl1 = myScanner.nextDouble();
			System.out.println("Bitte geben Sie den 2. Summanden an");
			zahl2 = myScanner.nextDouble();
			System.out.println(zahl1 + " + " + zahl2 + " = " +  ts.add(zahl1, zahl2));
			break;
		case '2':
			System.out.println("Bitte geben Sie den Minuend an");
			zahl1 = myScanner.nextDouble();
			System.out.println("Bitte geben Sie den Subtrahend an");
			zahl2 = myScanner.nextDouble();
			System.out.println(zahl1 + " - " + zahl2 + " = " +  ts.sub(zahl1, zahl2));
			break;
		case '3':
			System.out.println("Bitte geben Sie den 1. Faktor an");
			zahl1 = myScanner.nextDouble();
			System.out.println("Bitte geben Sie den 2. Faktor an");
			zahl2 = myScanner.nextDouble();
			System.out.println(zahl1 + " * " + zahl2 + " = " +  ts.mul(zahl1, zahl2));
			break;
		case '4':
			System.out.println("Bitte geben Sie den Dividend an");
			zahl1 = myScanner.nextDouble();
			System.out.println("Bitte geben Sie den Divisor an");
			zahl2 = myScanner.nextDouble();
			System.out.println(zahl1 + " / " + zahl2 + " = " +  ts.div(zahl1, zahl2));
			break;
		case '5' :
			System.exit(0);
		 
		default:
			System.out.println("Invalid selection");
			break; // This break is not really necessary(OK)
		}

	}


}
