package SuperCallUsage;

class Product {
	String brand;
	String type;
	public Product(String brand,String type) {
		this.brand=brand;
		this.type=type;
	}
	public void printProduct() {
		System.out.println("Product-brand: "+brand+", Product-type: "+type);
	}
}
