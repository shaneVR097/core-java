package Encapsulation;

class Hospital {
	static int totalBeds = 500;
	
	static class Doctor {
	    public static void checkBeds() {
	        System.out.println("Total beds from Doctor class: " + totalBeds);
	    }
	}
	
	private static class Nurse {
	    public static void viewBeds() {
	        System.out.println("Total beds from Nurse class: " + totalBeds);
	    }
	}
	
	static interface Treatment {
	    enum Category {
	        OPD, EMERGENCY, SURGERY
	    }
	}
	
	public static void main(String[] args) {
	    Doctor.checkBeds();
	    Nurse.viewBeds();
	    System.out.println("Treatment Category: " + Treatment.Category.EMERGENCY);
	}
}

