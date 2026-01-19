package Interface;

interface Test {
	public static final int a=10;
	int b=20; // 'public static final' is default for any variable whether explicitly written or not
	
	private void m1() {
		System.out.println("private method");
	}
	
	default void m2() {
		System.out.println("default method");
		m1();
	}
	
	public static void m3() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		System.out.println("hi");
	}
}
