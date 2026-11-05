package primalgo;

public class Stoppuhr {
	long z1;
	long z2;

public void starten() {
	z1 = System.currentTimeMillis();	
}
public void stoppen() {
	z2 = System.currentTimeMillis();
}
public void reset() {
	z1 = 0;
	z2 = 0;
}
public double getVergangeneZeit() {
	return (z2 - z1);
}
}