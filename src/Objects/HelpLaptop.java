package Objects;

public class HelpLaptop {
	public static Laptop getLaptop(){ //simple object creation and return
		return new Laptop();
	}
	
	public static Laptop getLaptopWithData(String brand,double price){ // object creation with passed info and return
		Laptop l=new Laptop();
		l.brand=brand;
		l.price=price;
		return l;
	}
	
	public static Laptop verifyLaptopPrice(double lb,double ub,double price,String brand) { // object creation after verification and return otherwise no object creation
		if(price>=lb && price<=ub) {
			System.out.println(brand+" with price "+price+" is within "+lb+" and "+ub);
			return getLaptopWithData(brand, price);
		} else {
			System.out.println(brand+" with price "+price+" is not within "+lb+" and "+ub);
			return null;
		}
	}
}
