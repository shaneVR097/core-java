package Methods;

public class Example2 {
	public static void m1() {//Called method
		m2();
		System.out.println("m1");
	}

	public static void m2() {//Called method
		System.out.println("m2");
		m3();
	}
	
	public static void m3() {//Called method
		m4();
		System.out.println("m3");
	}
	
	public static void m4() {//Called method
		System.out.println("m4");
	}
	
	public static void main(String[] args) {//Caller method
		System.out.println("Main start");
		m1();
		System.out.println("Main end");
	}
}
