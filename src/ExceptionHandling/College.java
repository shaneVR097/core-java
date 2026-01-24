package ExceptionHandling;

public class College { //outer class
	static int a=10;
	static class Student{ //inner class
		public static void m1() {
			System.out.println(a);
		}
	}
	private static class Trainer{
		public static void m2() {
			System.out.println(a);
		}
	}
	static interface Course{
		
	}
	public static void main(String[] args) {
		Student.m1();
		Trainer.m2();
	}
}
//create an outer class with 3 inner classes and an interface with inner enum class of gender 