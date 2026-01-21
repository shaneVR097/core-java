package StringClass;

public class StringImmutability {
	public static void main(String[] args) {
		String s="abc";
		System.out.println(s.hashCode());
		s=s+"123";
		System.out.println(s.hashCode());
	}
}
