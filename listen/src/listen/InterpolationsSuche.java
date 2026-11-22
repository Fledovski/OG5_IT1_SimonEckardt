package listen;

public class InterpolationsSuche {

	public static int interpolationsSuche(int gesucht, int[] daten) {

	    int r = (daten.length - 1);
	    int l = 0;

	    while (gesucht >= daten[l] && gesucht <= daten[r] && l <= r) { //Waehrend gesuchte zahl noch im Zahlenberreicht ist:
	        int probe = l + (r - l) * (gesucht - daten[l]) / (daten[r] - daten[l]); //setzt "probe" auf den vermutlichen Index
	        if (r == l) { //Fall Liste nur noch einen Index hat
	            if (daten[l] == gesucht) {
	                return l;
	            } else {
	                return -1;
	            }
	        }
	        if (daten[probe] == gesucht) { //Falls der vermutliche Index der korrekte wahr
	            return probe;
	        }
	        if (daten[probe] < gesucht) {
	            l = probe + 1;
	        } else {
	            r = probe - 1;
	        }
	    }
	    return -1;
	}
	}
