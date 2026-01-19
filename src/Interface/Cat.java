package Interface;

public class Cat implements Animal{
	@Override
	public void skincolor(String color) {
		System.out.println("Skin color of cat is: "+color);
	}
	public void makesound(String sound) {
		System.out.println("Cat makes '"+sound+"' sound");
	}
}
