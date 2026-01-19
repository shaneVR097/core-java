package Interface;

public class Dog implements Animal{
	@Override
	public void skincolor(String color) {
		System.out.println("Skin color of dog is: "+color);
	}
	public void makesound(String sound) {
		System.out.println("Dog makes '"+sound+"' sound");
	}
//	public static void main(String[] args) {
//		Dog d=new Dog();
//		d.skincolor("Yellow-black");
//		d.makesound("bhow bhow");
//	}
}
