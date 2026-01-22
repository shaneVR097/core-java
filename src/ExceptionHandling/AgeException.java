package ExceptionHandling;

public class AgeException extends RuntimeException { 
	public AgeException(String message) {
		super(message);
	}
	public static void checkAge(int age) {
		if(age >0 ) {
			System.out.println("age is valid !!");
		} else {
			throw new AgeException("Invalid age !!");
		}
	}
	public static void main(String[] args) {
		int age=10;
//		checkAge(age);
		try {
			int age2=-6;
			checkAge(age2);
		} catch (AgeException e) {
			System.out.println("age exception handled !!");
		}
		
//		age=-20;
//		checkAge(age);
	}
}
