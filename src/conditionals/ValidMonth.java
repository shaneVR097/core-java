package conditionals;

public class ValidMonth {
	public static void main(String[] args) {
		int month=13;
		if(month<=0 || month>=12) {
			System.out.println(month+" is Not a Valid Month");
		} else {
			System.out.println(month+" is a Valid Month");
		}
	}
}
