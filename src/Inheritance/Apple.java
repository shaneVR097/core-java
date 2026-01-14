package Inheritance;

public class Apple extends Fruit {
	double price;
	
	public Apple(String name,String color,double price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	public void printApple() {
		System.out.println("Apple name: "+name+", color: "+color+", price: "+price);
	}
	
	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.name="Mango";
		f.color="Yellowish-orange";
		//f.price=20.99; //parent class object reference cannot access child class member
		f.printFruit();
		Apple a=new Apple("Kashmiri","red",240.00);
		a.printApple();
	}
}
