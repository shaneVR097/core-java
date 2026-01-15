package Inheritance;

public class Car2 extends Vehicle2{
	String brand;
	double price;
	
	Car2(){
		
	}
	
	Car2(String color,String brand,double price) {
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
	public void printCar2() {
		System.out.println("Car-Color: "+color+", Car-brand: "+brand+", Car-price: "+price);
	}
	
	public static void main(String[] args) {
		Car2 b=new Car2("Marine-blue","Skoda Slavia",1500000.00);
		b.printCar2();
	}
	
}
