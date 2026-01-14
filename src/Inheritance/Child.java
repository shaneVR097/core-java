package Inheritance;

public class Child extends Parent{
	int b=20;
	public void m2() {
		System.out.println("Child Class !!");
	}
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.m1();
		c.m2();
		//System.out.println(c.a);
		Parent p=new Parent();
		System.out.println(p.a);
		p.m1();
		// System.out.println(p.b); // parent cannot access child class member
		//p.m2(); // parent cannot access child class member
	}
}
