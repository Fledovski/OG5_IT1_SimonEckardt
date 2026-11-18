package listen;

public class LineareSuche {
	
	public static int lineareSuche(final int gesucht, final int[] daten) {
	    for (int i = 0; i < daten.length; i++) {
	        if (daten[i] == gesucht) {
	            return i;
	        }
	    }
	    return -1;
	}
}
