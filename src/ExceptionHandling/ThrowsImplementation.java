package ExceptionHandling;

public class ThrowsImplementation {
	public static void main(String[] args) throws ClassNotFoundException, ArithmeticException {
		System.out.println("hi1");
		Class.forName("Array1Dassignment.BasicArray");
		System.out.println("bye1");
		System.out.println("hi2");
		Class.forName("Array1Dassignment.BasicArra");
		System.out.println("bye2");
	}
}
