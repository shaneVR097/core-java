package Inheritance;

class Parent2 {
	public void m1() {
		
	}
}

public class Child2 extends Parent2{
	public void m2() {
		
	}
	public static void main(String[] args) {
		Child2 c=new Child2();
		Parent2 p=c;
		p.m1();
		// p.m2(); // cant access child member using parent ref once it is uocasted to parent class
		c=(Child2)p;
		c.m1();
		c.m2();
	}
}
