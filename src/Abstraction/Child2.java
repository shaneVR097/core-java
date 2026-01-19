package Abstraction;

public class Child2 extends Child1{
	@Override
//	public void homeloan() {
//		System.out.println("child2 paid off home loan");
//	}
	public void goldloan() {
		System.out.println("child2 paid off gold loan");
	}
	
	public void bike() {
		System.out.println("bmw");
	}
	
	public static void main(String[] args) {
		Child2 c=new Child2();
		c.homeloan();
		c.goldloan();
		c.bike();
		Child1 c1=new Child2(); //uc
		c1.homeloan();
		c1.goldloan();
		//c1.bike(); // not possible
		Child2 c3=(Child2)c1;
		c3.bike();
		Parent p=new Child2(); //uc
		p.homeloan(); //it is working since child is giving implementation and overridden when called by parent object reference  
		p.goldloan();
		
		Child1 c4=new Child2();
		c4.homeloan();
		
	}
}
