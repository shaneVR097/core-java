package ExceptionHandling;

public class TypesOfException {
	public static void main(String[] args) {
		int a=9,b=0;
//		System.out.println(a/b); //Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at core_java/ExceptionHandling.ArithmeticExcptn.main(ArithmeticExcptn.java:6)

		String s="abc";
//		System.out.println(s.charAt(5)); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 5 out of bounds for length 3
		s=null;
//		System.out.println(s.charAt(9)); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "s" is null
//		at core_java/ExceptionHandling.ArithmeticExcptn.main(ArithmeticExcptn.java:12)

//		System.out.println(s.toLowerCase()); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "s" is null
//		at core_java/ExceptionHandling.TypesOfException.main(TypesOfException.java:14)

		int[] arr= {1,2,3};
//		System.out.println(arr[4]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
//		at core_java/ExceptionHandling.ArithmeticExcptn.main(ArithmeticExcptn.java:16)
		
		try {
			System.out.println(a/b);	
		} catch (ArithmeticException e) {
			System.out.println("/ by 0 !!");
		}
		
		try {
			System.out.println(s.charAt(5));
		} catch (StringIndexOutOfBoundsException e2) {
			System.out.println("String Index Out Of Bounds Exception !!");
		}
		
		s=null;
		try {
			System.out.println(s.toLowerCase());
		} catch (StringIndexOutOfBoundsException e3) {
			System.out.println("String Index Out Of Bounds Exception !!");
		}

		try {
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("String Index Out Of Bounds Exception !!");
		}
	}
}
