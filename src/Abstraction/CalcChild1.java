package Abstraction;

public class CalcChild1 extends Calculator{
	//@Override
	public int add(int a,int b) {
		return a+b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public void m1() {
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		//Calculator c1=new Calculator(); cannot make object reference to abstract class
		//CalcChild1 c= new CalcChild1();
		Calculator c= new CalcChild1(); //up-casting
		System.out.println(c.add(2,3));
		System.out.println(c.mul(2,3));
		System.out.println(c.sub(2,1));
		CalcChild1 c2= new CalcChild1();
		System.out.println(c2.add(2,3));
		System.out.println(c2.mul(2,3));
		System.out.println(c2.sub(2,1));
		c2.m1();
		//c.m1();
	}
}
// we cannot create object for abstract class