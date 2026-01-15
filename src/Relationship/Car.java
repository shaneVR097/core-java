package Relationship;

public class Car {
	private int vin;
	private String brand;
	private String color;
	private Engine e;
	
	Car(){
		
	}
	
	Car(int vin,String brand,String color,Engine e){
		setVin(vin);
		setBrand(brand);
		setColor(color);
		setE(e);
	}
	
	public int getVin() {
		return vin;
	}
	public void setVin(int vin) {
		this.vin = vin;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	
	public void printCar() {
		System.out.println("Car VIN no.: "+getVin()+", Brand name: "+getBrand()+", Car color: "+getColor()+", Engine-displacement: "+e.getcc()+", Fuel-type: "+e.gettype());
	}
	
//	public static void main(String[] args) {
//		Engine eng=new Engine(1000,"Diesel");
//		Car c=new Car(23456,"Hyundai","White",eng);
//		
//		c.e=eng;//has-a relationship of composition-type
//		c.printCar();
//		c.e.printEngine();
//	}
	
}
