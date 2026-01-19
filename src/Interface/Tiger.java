package Interface;

public class Tiger implements Animal{
	@Override
	public void skincolor(String color) {
		System.out.println("Skin color of tiger is: "+color);
	}
	public void makesound(String sound) {
		System.out.println("Tiger makes '"+sound+"' sound");
	}
}

