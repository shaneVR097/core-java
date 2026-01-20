package ObjectClass;
import java.util.Scanner;
import java.util.Objects;

public class Vehicle {
	int vin;
	String brand;
	double price;
	String type;
	Vehicle(int vin,String brand,double price,String type){
		this.vin=vin;
		this.brand=brand;
		this.price=price;
		this.type=type;
	}
	@Override
	public String toString() {
		return ("VIN: "+vin+" Brand-name: "+brand+" Car-price: "+price+" Engine-type: "+type); 
	}
	public int hashCode() {
		return Objects.hash(vin,brand,price,type);
	}
	public boolean equals(Object o) {
		if(o==null) {
			System.out.println("Null object reference !!");
			return false;
		}
		if(this.getClass()!=o.getClass()) {
			System.out.println("Class mismatch !!");
			return false;
		}
		if(this==o) {
			System.out.println("Same Object !!");
			return true;
		}
		Vehicle v=(Vehicle) o;
		if(this.vin==v.vin && this.brand==v.brand && this.price==v.price && this.type==v.type)
			return true;
		else
			return false;
			
	}
	public boolean compareContent(Vehicle v) {
		if(this.hashCode()==v.hashCode())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Vehicle v=new Vehicle(101,"hyundai",2200000.09,"petrol");
		System.out.println(v);
		System.out.println(v.toString());
		Scanner sc=new Scanner(System.in);
		
		Vehicle v2=new Vehicle(102,"tata",2300000.03,"ev");
		Vehicle v3=new Vehicle(102,"tata",2300000.03,"ev");
		Vehicle v4=new Vehicle(103,"mahindra",2200000.09,"diesel");
		System.out.println("\nCheck same object content: "+v2.compareContent(v3));
		System.out.println("\nCheck eqaulity of objects: "+v3.equals(v2));
		System.out.println("\nCheck same object content: "+v2.compareContent(v4));
		System.out.println("\nCheck eqaulity of objects: "+v3.equals(v4));
		Vehicle v5=null;
		System.out.println("\nCheck null-pointer-exception: "+v2.equals(v5));
		Employee e=new Employee(10,"xyz",22000.09,"dev");
		System.out.println("\nCheck class-cast-exception: "+v2.equals(e));
		System.out.println("\nCheck same-class: "+v2.equals(v3));
		System.out.println("\nCheck same-object: "+v2.equals(v2));
		sc.close();
	}
}

