package Objects;

public class Product {
	int id;
	String nm;
	double price;
	float rating;

	public Product() {
		System.out.println("This is Product Class Non-argument Constructor");
	}
	
	public void Product(int id,String nm,double price,float rating) {
		this.id=id; this.nm=nm; this.price=price; this.rating=rating;
		System.out.println("This is Product Class Non-argument Constructor");
	}
	
	public void display() {
		System.out.println("product-id: "+id+" product-name: "+nm+" product price: "+price+" user-rating: "+rating);
	}
	
	public static void main(String[] args) {
		Product p=new Product();
		p.display();
		p.Product(1, "Soap", 9.87, 3.5f);
		p.display();
	}

}
