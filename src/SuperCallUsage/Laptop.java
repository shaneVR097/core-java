package SuperCallUsage;

public class Laptop extends Product{
	double price;
	String pb;
	Laptop(String brand,String type,double price,String pb){
		super(brand,type);
		this.price=price;
		this.pb=pb;
	}
	public void printLaptop() {
		System.out.println("Laptop-brand: "+brand+", Laptop-type: "+type+", Processor-brand: "+pb);
	}
	public static void main(String[] args) {
		Laptop l=new Laptop("Asus","Laptop",40000.00,"Intel");
		System.out.println(l.brand+" "+l.type+" "+l.price+" "+l.pb);
		l.printProduct();
		l.printLaptop();
	}
}

