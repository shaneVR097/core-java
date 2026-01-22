package ExceptionHandling;

public class FinallyMethod {
	public static void main(String[] args) {
		try {
			System.out.println(9/0);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic exception !!");
		} finally { //to write clean up code
			System.out.println("finally block !!");
		}
		
		try {
			
		} catch(Exception e) {
			
		} finally {
			System.out.println("finally block !!");
		}
		
		try {
			System.out.println(9/0);
		} catch(NullPointerException e) {
			System.out.println("Null pointer exception !!");
		} finally { //to write clean up code
			System.out.println("finally block !!");
		}
		
		
	}
}
