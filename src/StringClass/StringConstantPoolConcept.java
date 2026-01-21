package StringClass;

public class StringConstantPoolConcept {
	public static void main(String[] args) {
		String s1=new String("xyz");  // Creates new object in heap, "xyz" added to SCP if not present
		String s2="abc";  // Uses existing "abc" from SCP (created earlier with variable c)
		String s3="xyz";  // Uses existing "xyz" from SCP (created earlier with variable a)
		String s6="abc";  // Uses existing "abc" from SCP (same as s2)
		String s4=new String("xyz");  // Creates another new object in heap
		String s5=new String("abc");  // Creates new object in heap for "abc"
		
		System.out.println("\n 7: "+s1.equals(s3));  // Output: true - Same content "xyz"
		System.out.println("\n 8: "+(s1==s3));       // Output: false - s1 is heap object, s3 is SCP reference
		System.out.println("\n 9: "+s4.equals(s5));  // Output: false - Different content "xyz" vs "abc"
		System.out.println("\n 10: "+(s4==s5));      // Output: false - Different heap objects
		System.out.println("\n 11: "+s1.equals(s4)); // Output: true - Same content "xyz"
		System.out.println("\n 12: "+(s1==s4));      // Output: false - Different heap objects, even with same content
		System.out.println("\n 13: "+s2.equals(s6)); // Output: true - Same content "abc", both refer to same SCP object
		System.out.println("\n 14: "+(s2==s6));      // Output: true - Both refer to same "abc" object in SCP
	}
}