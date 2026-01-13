package Methods;
import Methods.StaticVarExample2;
import Methods.StaticVarExample3;
public class StaticVarExample {
	static int a=10;
	static int b;
	static String pm="Prime Minister";
	static String c;
	
	static {
		int a=30;//local variable of this static block, it cant be accessed out of this static block and not to be confused with a static variable
		System.out.println("Static Block 1 Example"); //static block is called before main, only once and can't be explicitly called 
		System.out.println(a);
		e1();
	}
	
	static {
		System.out.println("Static Block 2 Example"); //static block is called before main, only once and can't be explicitly called 
	}
	
	public static void e1() {
		System.out.println(a+" "+b+" "+pm+" "+c);
	}
	
	public static void e2() {
		int a=20;
		System.out.println(Methods.StaticVarExample.a+" "+a+" "+b+" "+pm+" "+c);
	}
	
	public static void e3() {
		System.out.println(Methods.StaticVarExample2.name); //accessing other class static variable using class-name
		System.out.println(StaticVarExample2.add(2,3,4)); //accessing other class static method using class-name
	}
	
	public static void driver() {
		System.out.println(StaticVarExample2.palchk(StaticVarExample3.num1)); 
		System.out.println(StaticVarExample2.primechk(Methods.StaticVarExample3.num2)); 
	}
	
	public static void main(String[] args) {
		System.out.println("main method"); 
		e1();
		e2();
		e3();
		driver();
	}
	
	static {
		System.out.println("Static Block 3 Example"); //static block is called before main, only once and can't be explicitly called 
	}
}
