package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list
	 *            Liste der Codes im Long-Format
	 * @param searchValue
	 *            Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	public static int findPromoCode(long[] daten, long gesucht) {
		int r = (daten.length - 1);
	    int l = 0;

	    while (gesucht >= daten[l] && gesucht <= daten[r] && l <= r) {
	        long probe = l + (r - l) * (gesucht - daten[l]) / (daten[r] - daten[l]);
	        if (r == l) {
	            if (daten[l] == gesucht) {
	                return l;
	            } else {
	                return -1;
	            }
	        }
	        if (daten[(int) probe] == gesucht) {
	            return (int) probe;
	        }
	        if (daten[(int) probe] < gesucht) {
	            l = (int) (probe + 1);
	        } else {
	            r = (int) (probe - 1);
	        }
	    }
	    return -1;

}
}