package primalgo;
public class Primzahlen {

public static String istPrim(long zahl) {
	boolean check = false;
	if (zahl > 2) {
		for (long i = 2; i <= Math.sqrt(zahl); i++) {
			if ((zahl%i) == 0) {
				check = true;
			}
		}
	}else if (zahl < 2){
		check = true;
	}
		
		if (check == false) {
			return ("\n" + zahl + " ist eine Primzahl!");
		} else {
			return ("\n" + zahl + " ist keine Primzahl!");
		}
	}
	
}