package ExceptionHandling;

public class DriverClass {
	public static void main(String[] args) {
//		try {
//			Thread.sleep(9/0);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			int age2=-6;
		 	AgeException.checkAge(age2);
		} catch (AgeException e) {
			System.out.println("age exception handled !!");
		}
		
		try {
			String pw="hello";
		 	PasswordLengthException.checkpwlen(pw);
		} catch (PasswordLengthException e) {
			System.out.println("Password length exception handled !!");
		}
	}
}


