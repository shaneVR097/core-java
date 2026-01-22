package ExceptionHandling;

public class CheckedExceptionHandling {
	public static void main(String[] args) {
		System.out.println("hii");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("sleep method called !!");
			e.printStackTrace();
		}  
		System.out.println("bye"); //interrupted exception
		System.out.println("hii2");
		try {
			Class.forName("ExceptionHandling.CheckedExceptionHandling"); // give correct fully qualified class-name
			Class.forName("Array1Dassignment.BasicArray"); // give correct fully qualified class-name
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class Info is wrong !!");
//			e.printStackTrace();
		}
		System.out.println("bye2"); //interrupted exception
		System.out.println("hii3");
		try {
			Class.forName("Array1Dassignment.BasicAray"); // give correct fully qualified class-name
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class Info is wrong !!");
//			e.printStackTrace();
		}
		System.out.println("bye3"); //interrupted exception
	}
}
