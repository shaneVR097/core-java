package Polymorphism;

public class Child extends Parent{
	@Override
	public void home() {
		System.out.println("Home color is red !!");
	}
	
	public void bike() {
		System.out.println("BMW");
	}
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.home();
		//p.bike();
		Child c=new Child();
		c.home();
		c.bike();
		p=c; //upcasting
		p.home();
	}
}
