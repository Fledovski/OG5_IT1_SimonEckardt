package de.oszimt.starsim2099;

public class TestMond {

	public static void main(String[] args) {
		double posX = (double)(Math.random() * 160);
		double posY = (double)(Math.random() * 50);
		String name = "Max Muster Mond";
		
		Mond meinMond = new Mond();
		meinMond.setName(name);
		meinMond.setPosX(posX);
		meinMond.setPosY(posY);
		
		
			
		if (meinMond.getName().equals(name))
			System.out.println("Implementierung 'Name'  korrekt!");
		
		if (meinMond.getPosX() == posX)
			System.out.println("Implementierung 'Position X' korrekt!");
		
		if (meinMond.getPosY() == posY)
			System.out.println("Implementierung 'Position Y' korrekt!");
		System.out.println(meinMond.getTyp());

	}

}
