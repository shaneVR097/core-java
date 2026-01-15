package TypCstNonPrim;

public class HelperVehicle {
	public static void main(String[] args) {
		Bike b=new Bike();
		getVehicle(b);
		Car c=new Car();
		getVehicle(c);
		Train t=new Train();
		getVehicle(t);
		System.out.println(b instanceof Bike); //true
		System.out.println(c instanceof Car); //true
		System.out.println(t instanceof Train); //true
		Vehicle v=new Bike(); //upcasting
		System.out.println(v instanceof Vehicle); //true 
		System.out.println(v instanceof Bike); //true
		System.out.println(v instanceof Car); //false
		Bike b2 =(Bike) v; //downcasting
		System.out.println(b2 instanceof Vehicle); //
		System.out.println(b2 instanceof Bike);
	}
	public static void getVehicle(Vehicle v) {
//		System.out.println(v.getClass().getSimpleName());
		if (v.getClass().getSimpleName().equals("Bike")) {
			Bike b=(Bike)v;
			b.numWheels();
		} else if (v.getClass().getSimpleName().equals("Car")) {
			Car c=(Car)v;
			c.numPssngrs();
		}  else if (v.getClass().getSimpleName().equals("Train")) {
			Train t=(Train)v;
			t.ticketprice();
		}
	}
}
