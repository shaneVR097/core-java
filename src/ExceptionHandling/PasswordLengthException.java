package ExceptionHandling;

public class PasswordLengthException extends RuntimeException { 
	public PasswordLengthException(String message) {
		super(message);
	}
	public static void checkpwlen(String s) {
		if(s.length()>=6 ) {
			System.out.println("Password Length is valid !!");
		} else {
			throw new PasswordLengthException("Password Length is less than 6 !!");
		}
	}
	public static void main(String[] args) {
		String pw="hello1";
		checkpwlen(pw);
		try {
			String pw2="hello";
			checkpwlen(pw2);
		} catch (PasswordLengthException e) {
			System.out.println("Password length exception handled !!");
		}
	}
}
