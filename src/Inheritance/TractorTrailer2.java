package Inheritance;

class Truck2 extends Vehicle2 {
	String brand;
	double price;
	public void printTruck2() {
		System.out.println("Truck-Color: "+color+", Truck-brand: "+brand+", Truck-price: "+price);
	}
}

public class TractorTrailer2 extends Truck2 {
	int gvw;
	int pwr;
	String type;
	
	TractorTrailer2(){
		
	}
	
	TractorTrailer2(String color, String brand, double price, int gvw, int pwr, String type){
		this.color=color; this.brand=brand; this.price=price; this.gvw=gvw; this.pwr=pwr; this.type=type;
	}
	
	public void printTractorTrailer2() { 
		System.out.println("Truck-Gross Wt.: "+gvw+"kgs, Truck-power: "+pwr+"hp, Fuel-type: "+type);
	}
	
	public static void main(String[] args) {
		TractorTrailer2 t=new TractorTrailer2("Brown","Tata",3800000.00,45000,320,"Diesel");
		t.printTruck2();
		t.printTractorTrailer2();
		
	}
}
