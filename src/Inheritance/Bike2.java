package Inheritance;

public class Bike2 extends Vehicle2{
	String brand;
	double price;
	
	Bike2(){
		
	}
	
	Bike2(String color,String brand,double price) {
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
	public void printBike2() {
		System.out.println("Bike-Color: "+color+", Bike-brand: "+brand+", Bike-price: "+price);
	}
	
	public static void main(String[] args) {
		Bike2 b=new Bike2("blue-black","Bajaj Pulsar",75000.00);
		b.printBike2();
	}
	
}
