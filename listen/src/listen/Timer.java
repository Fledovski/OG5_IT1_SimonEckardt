package listen;


public class Timer {
	  static long z1;
	  static long z2;

	public static void starten() { //Speichert die Startzeit (in ms)
	  z1 = System.currentTimeMillis();  
	}
	public static void stoppen() { //Speichert die Stoppzeit (in ms)
	  z2 = System.currentTimeMillis();
	}
	public static void reset() { // Setz Start- und Stoppzeit auf 0
	  z1 = 0;
	  z2 = 0;
	}
	public static double getVergangeneZeit() { //Gibt die vergangene Zeit in ms als double 
	  return (z2 - z1);
	}
	}
