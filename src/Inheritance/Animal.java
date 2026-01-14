package Inheritance;

public class Animal {
	String name;
	String color;
	int legs;
	public void printAnimal() {
		System.out.println("Animal name: "+name+", color: "+color+", number of legs: "+legs);
	}
	public static void main(String[] args) {
		Animal a=new Animal();
		a.name="Kangaroo";
		a.color="brown";
		a.legs=2;
		a.printAnimal();
		Dog d=new Dog("Dogesh bhai","black and white");
		d.printAnimal();
	}
}

class Dog extends Animal {
	Dog(String name,String color){
		this.name=name;
		this.color=color;
		this.legs=4;
	}
}
