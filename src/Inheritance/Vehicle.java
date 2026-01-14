package Inheritance;

public class Vehicle {
	String brand;
	String color;
	double price;
	
	public void printVehicle() {
		System.out.println("Bike of "+brand+" of color "+color+" comes at a price of "+price);
	}
	
	public static void main(String[] args) {
		Bike b=new Bike("BMW","black",100000.00);
		b.printVehicle();
		Vehicle v=new Vehicle();
		v.brand="Honda";
		v.color="red";
		v.price=75000.00;
		v.printVehicle();
	}
}

class Bike extends Vehicle {
	Bike(String brand,String color,double price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
}
