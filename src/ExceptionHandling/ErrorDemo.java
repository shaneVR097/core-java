package ExceptionHandling;

public class ErrorDemo {
	public static void main(String[] args) {
//		m1(); //at core_java/ExceptionHandling.ErrorDemo.m1(ErrorDemo.java:19)
		String s=" "; // Exception in thread "main" java.lang.OutOfMemoryError: Overflow: String length out of range
//		at java.base/java.lang.StringConcatHelper.checkOverflow(StringConcatHelper.java:68)
//		at java.base/java.lang.StringConcatHelper.mix(StringConcatHelper.java:127)
//		at java.base/java.lang.StringConcatHelper.simpleConcat(StringConcatHelper.java:434)
//		at core_java/ExceptionHandling.ErrorDemo.main(ErrorDemo.java:8)
//	
		
		try {
			m1();
		} catch ( StackOverflowError e) {
			System.out.println("StackOverflow error handled !!");
		}
		try {
		while(1>0) {
			s+=s;
		}
		} catch (OutOfMemoryError e) {
			System.out.println("out of memory error handled !!");
		}
		
	}
	public static void m1() {
		System.out.println("yaw yawn yeee !! yoo yoo !!");
		ErrorDemo.m1();
	}
}
