package listen;

public class LineareSuche {
	
	public static long lineareSuche(final long gesucht, final long[] daten) {
	    for (int i = 0; i < daten.length; i++) {
	        if (daten[i] == gesucht) {
	            return i;
	        }
	    }
	    return -1;
	}
}
