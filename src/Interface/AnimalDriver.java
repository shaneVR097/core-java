package Interface;

public class AnimalDriver {
	public static void main(String[] args) {
		Animal d=new Dog();
		d.skincolor("yellow-white");
		d.makesound("bhow bhow");

		Animal c=new Cat();
		c.skincolor("orange");
		c.makesound("meow meow");

		Animal t=new Tiger();
		t.skincolor("ochre-yellow");
		t.makesound("roar");
		
		Tiger t2=(Tiger) t;
		t2.skincolor("yellowish-white");
		t2.makesound("siberian-roar");
		
	}
}
