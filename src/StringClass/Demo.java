package StringClass;

public class Demo {
	public static void main(String[] args) {
		String a="xyz";
		String b="xyz";
		String c="abc";
		System.out.println("\n 1: "+a.toString());  // Output: xyz - toString() returns the string itself
		System.out.println("\n 2: "+a.equals(b));   // Output: true - Both have same content "xyz"
		System.out.println("\n 3: "+a.equals(c));   // Output: false - Different content "xyz" vs "abc"
		System.out.println("\n 4: "+(a.hashCode()==b.hashCode()));  // Output: true - Same content generates same hashcode
		System.out.println("\n 5: "+(a.hashCode()==c.hashCode()));  // Output: false - Different content generates different hashcode
		System.out.println("\n 6: "+(a.getClass()==b.getClass()));  // Output: true - Both are String class objects
	}
}