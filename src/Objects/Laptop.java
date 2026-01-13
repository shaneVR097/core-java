package Objects;

public class Laptop {
	String brand;
	double price;
	public void Laptop(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}

	public void compareLaptop(Laptop l) {
		if(price<l.price)
			System.out.println(brand+" is cheaper");
		else
			System.out.println(l.brand+" is cheaper");
	}
	
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.Laptop("Asus", 40000.00);
		Laptop l2=new Laptop();
		l2.Laptop("HP", 50000.00);
		Laptop l3=new Laptop();
		l3.Laptop("Acer", 35000.00);
		l2.compareLaptop(l1);
		l1.compareLaptop(l3);
		l3.compareLaptop(l2);
	}
}
