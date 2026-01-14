package Objects;

public class Laptop {
	String brand;
	double price;
	
	public Laptop() { // no argument constructor
		
	}
	
	public Laptop(String brand,double price) { // parameterized constructor
		this.brand=brand;
		this.price=price;
	}

	public void Laptop(String brand,double price) { //setter method with same method name as class-name
		this.brand=brand;
		this.price=price;
	}
	
	public void compareLaptop(Laptop l) { // single object passed comparator
		if(price<l.price)
			System.out.println(brand+" is cheaper");
		else
			System.out.println(l.brand+" is cheaper");
	}
	
	public void compareLaptop2(Laptop la,Laptop lb) { // more than one object passed comparator
		if(price<la.price && price<lb.price )
			System.out.println(brand+" is cheaper than "+la.brand+" and "+lb.brand);
		else if(la.price<price && la.price<lb.price)
			System.out.println(la.brand+" is cheaper "+brand+" and "+lb.brand);
		else if(lb.price<price && lb.price<la.price)
			System.out.println(lb.brand+" is cheaper "+brand+" and "+la.brand);
	}
	
	public void compareLaptop3(Laptop l,double price) { //comparator for checking within a range whose range_var has same var_name as object var_name 
		if(l.price<=price && this.price<=price)
			System.out.println("Both the brands "+this.brand+" and "+l.brand+" costs within "+price);
		else if(l.price<=price)
			System.out.println(l.brand+" is within "+price);
		else if(this.price<=price)
			System.out.println(this.brand+" is within "+price);
		else
			System.out.println("Both the brands "+this.brand+" and "+l.brand+" costs more than "+price);
	}
	
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.Laptop("Asus", 40000.00);
		Laptop l2=new Laptop();
		l2.Laptop("HP", 50000.00);
		Laptop l3=new Laptop();
		l3.Laptop("Acer", 35000.00);
		Laptop l4=HelpLaptop.getLaptop();
		l4.brand="Lenovo";
		l4.price=45000.00;
		Laptop l5=HelpLaptop.getLaptopWithData("Victus", 65000.00);
		Laptop l6=new Laptop("ROG",98000.00);
		l2.compareLaptop(l1);
		l1.compareLaptop(l3);
		l3.compareLaptop(l2);
		l1.compareLaptop2(l2, l3);
		l1.compareLaptop3(l3, 40000.00);
		l2.compareLaptop3(l3, 30000.00);
		l4.compareLaptop2(l3, l5);
		l5.compareLaptop3(l4, 70000.00);
		l6.compareLaptop2(l4, l5);
		Laptop l7=HelpLaptop.verifyLaptopPrice(50000.00,500000.00,80000.00, "Apple");
		if(l7!=null)
			l7.compareLaptop(l6);
		Laptop l8;
		//System.out.println(l8); // not possible to print because l8 is a local variable kind of object reference variable and we know that without initializing local variable we cannot use it
		Laptop l9=null;
		System.out.println(l9); // printable because local object reference variable is initialized although null
	}
}
