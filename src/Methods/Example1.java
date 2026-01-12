package Methods;

public class Example1 {
	public static void m1() {//Called method
		System.out.println("m1");
	}
	public static void main(String[] args) {//Caller method
		System.out.println("Main");
		m1();
	}
}