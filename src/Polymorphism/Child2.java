package Polymorphism;

public class Child2 extends Parent2{
		//@Override //override not possible for static method
		public static void home2() {
			System.out.println("Home2 color is red !!");
		}
		
		public static void bike2() {
			System.out.println("BMW2");
		}
		
		public static void main(String[] args) {
			Parent2 p=new Parent2();
			p.home2();
			//p.bike2();
			Child2 c=new Child2();
			c.home2();
			c.bike2();
			p=c; //upcasting
			p.home2(); //method hiding is occuring
		}
}
