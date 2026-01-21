package StringClass;

public class StringBuilderConcpt {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("szf");  // Creates StringBuilder object with initial content "szf"
		StringBuilder s2=new StringBuilder("szf");  // Creates another StringBuilder object with same content
		
		System.out.println(s1.equals(s2));  // Output: false - StringBuilder doesn't override equals(), uses Object.equals() which compares references
		System.out.println(s1==s2);         // Output: false - Different objects in memory
		System.out.println(s1);             // Output: "szf" - toString() is called implicitly
		System.out.println(s1.toString());  // Output: "szf" - Explicit toString() conversion
		
		s1=s1.reverse();                     // Reverses content and returns same StringBuilder object
		System.out.println(s1);              // Output: "fzs" - Content is now reversed
		
		String s3=new String(s1);            // Converts StringBuilder to String object
		System.out.println(s3);              // Output: "fzs" - Now a regular immutable String
		
		StringBuilder s4=new StringBuilder(s3);  // Creates StringBuilder from String
		System.out.println(s4);                  // Output: "fzs" - Back to mutable StringBuilder
		
		StringBuffer s5=new StringBuffer(s4);    // Creates StringBuffer from StringBuilder (thread-safe version)
		System.out.println(s5);                  // Output: "fzs" - Now in StringBuffer
		
		StringBuilder s6=new StringBuilder(s5);  // Creates StringBuilder from StringBuffer
		System.out.println(s6);                  // Output: "fzs" - Back to StringBuilder
		
		s1.append("xw");                        // Appends "xw" to s1's content
		System.out.println(s1);                 // Output: "fzsxw" - StringBuilder is mutable
		
		StringBuilder s7=new StringBuilder("  uoibiubik oiho  ihodtrsxtr    ");
		s7.trimToSize();                        // Reduces capacity to match current length - doesn't trim spaces!
		System.out.println(s7);                 // Output: same string with spaces - trimToSize() doesn't remove whitespace
		System.out.println(s7.capacity());      // Output: capacity reduced to current length (after trimToSize())
		
		StringBuilder s8=new StringBuilder();   // Creates empty StringBuilder
		System.out.println(s8.capacity());      // Output: 16 - Default initial capacity
		
		s7.insert(1, "th");						// Inserts "th" at index position 1
		System.out.println(s7);                 // Output: " th uoibiubik oiho  ihodtrsxtr    "
		// Explanation: At index 1 (after first space), "th" is inserted
		
		s7.delete(0, 13);                       // Deletes characters from index 0 to 12 (13 exclusive)
		System.out.println(s7);                 // Output: "biubik oiho  ihodtrsxtr    "
		// Explanation: Deletes " th uoibiubi" (13 characters starting from index 0)
		
		s7.replace(3, 9, "hvfj");              // Replaces characters from index 3 to 8 with "hvfj"
		System.out.println(s7);                 // Output: "bihvfj oiho  ihodtrsxtr    "
		// Explanation: Replaces "bik o" (positions 3-8) with "hvfj"
		
	}
}