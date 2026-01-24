package Encapsulation;

class University {
	static int universityCode = 1001;
	
	static class Professor {
	    public static void showCode() {
	        System.out.println("University Code from Professor: " + universityCode);
	    }
	}
	
	private static class Laboratory {
	    public static void displayCode() {
	        System.out.println("University Code from Lab: " + universityCode);
	    }
	}
	
	static interface Research {
	    enum Type {
	        BASIC, APPLIED, EXPERIMENTAL
	    }
	}
	
	public static void main(String[] args) {
	    Professor.showCode();
	    Laboratory.displayCode();
	    System.out.println("Research Type: " + Research.Type.APPLIED);
	}
}