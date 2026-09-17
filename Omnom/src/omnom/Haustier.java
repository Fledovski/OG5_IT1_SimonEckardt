package omnom;

public class Haustier {

private int hunger;
private int muede;
private int zufrieden;
private int gesund;
private String name;
public Haustier(String name) {
	super();
	this.name = name;
}
public int getHunger() {
	return hunger;
}
public void setHunger(int hunger) {
	this.hunger = hunger;
}
public int getMuede() {
	return muede;
}
public void setMuede(int muede) {
	this.muede = muede;
}
public int getZufrieden() {
	return zufrieden;
}
public void setZufrieden(int zufrieden) {
	this.zufrieden = zufrieden;
}
public int getGesund() {
	return gesund;
}
public void setGesund(int gesund) {
	this.gesund = gesund;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void fuettern(int menge) {
	hunger = hunger + menge;
}
public void schlafen(int menge) {
	muede = muede + menge;
}
public void spielen(int menge) {
	zufrieden = zufrieden + menge;
}
public void heilen() {
	gesund = 100;
}


}
