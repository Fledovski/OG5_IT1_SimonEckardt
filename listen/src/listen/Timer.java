package listen;


public class Timer {
	  static long z1;
	  static long z2;

	public static void starten() {
	  z1 = System.currentTimeMillis();  
	}
	public static void stoppen() {
	  z2 = System.currentTimeMillis();
	}
	public static void reset() {
	  z1 = 0;
	  z2 = 0;
	}
	public static double getVergangeneZeit() {
	  return (z2 - z1);
	}
	}
