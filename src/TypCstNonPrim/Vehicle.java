package TypCstNonPrim;

public class Vehicle {
	public void travel() {
		System.out.println("travelling in vehicle");
	}
	public static void main(String[] args) {
		Vehicle v1=new Car();
		Vehicle v2=new Bike();
		Vehicle v3=new Train();
		
		v1.travel();
		Car c1=(Car) v1;
		Bike b1=(Bike) v1;
		Train t1=(Train)v1;
		c1.travel();
		c1.numPssngrs();
		b1.travel();
		b1.numWheels();
		t1.travel();
		t1.ticketprice();
		
	}
}

class Car extends Vehicle {
	public void numPssngrs() {
		System.out.println(" 4 Number of passengers in car");
	}
}

class Bike extends Vehicle {
	public void numWheels() {
		System.out.println("2 Number of wheels in bike");
	}
}

class Train extends Vehicle {
	public void ticketprice() {
		System.out.println("5rs. Train ticket price");
	}
}