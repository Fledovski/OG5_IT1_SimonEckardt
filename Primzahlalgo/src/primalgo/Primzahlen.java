package primalgo;
public class Primzahlen {

public static String istPrim(long zahl) {
	boolean check = false;
	if (zahl > 2) {
		for (int i = 2; i < zahl; i++) {
			if ((zahl%i) == 0) {
				check = true;
			}
		}
	}else if (zahl < 2){
		check = true;
	}
		
		if (check == false) {
			return (zahl + " ist eine Primzahl!");
		} else {
			return (zahl + " ist keine Primzahl!");
		}
	}
	
}