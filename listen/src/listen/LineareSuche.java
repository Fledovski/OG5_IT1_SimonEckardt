package listen;

public class LineareSuche {
	
	public static int lineareSuche(int gesucht, int[] daten) {
	    for (int i = 0; i < daten.length; i++) {
	        if (daten[i] == gesucht) {
	            return i;
	        }
	    }
	    return -1;
	}
}
