package SuperCallUsage;

public class Mobile extends Product{
	double price;
	String simop;
	Mobile(String brand,String type,double price,String simop){
		super(brand,type);
		this.price=price;
		this.simop=simop;
	}
	public void printMobile() {
		System.out.println("Mobile-brand: "+brand+", Mobile-type: "+type+", Sim-Operator: "+simop);
	}
	public static void main(String[] args) {
		Mobile m=new Mobile("Moto","5G Mobile",16000.00,"Jio");
		System.out.println(m.brand+" "+m.type+" "+m.price+" "+m.simop);
		m.printProduct();
		m.printMobile();
	}
}
