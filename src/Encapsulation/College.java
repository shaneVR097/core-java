package Encapsulation;

public class College {
	static int a = 10;
	
	static class Student {
	    public static void m1() {
	        System.out.println(a);
	    }
	}
	
	private static class Trainer {
	    public static void m2() {
	        System.out.println(a);
	    }
	}
	
	static interface Course {
	    enum Level {
	        BEGINNER, INTERMEDIATE, ADVANCED
	    }
	}
	
	protected static class Department {
	    public static void m3() {
	        System.out.println("Department accessing outer static variable: " + a);
	    }
	}
	
	public static void main(String[] args) {
	    Student.m1();
	    Trainer.m2();
	    Department.m3();
	    System.out.println("Course Level: " + Course.Level.INTERMEDIATE);
	}
}