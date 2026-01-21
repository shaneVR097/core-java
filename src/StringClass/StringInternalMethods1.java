package StringClass;

public class StringInternalMethods1 {
	public static void main(String[] args) {
		String s="abc";
		
		System.out.println(s);
		s=s.toUpperCase();
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('C'));
		System.out.println(s.indexOf('D')); //since character not present in string so it returned -1
		System.out.println(s.length());
	}
}
