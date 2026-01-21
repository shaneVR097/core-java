package StringClass;

public class StringBufferConcpt {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("szf");
		StringBuffer s2=new StringBuffer("szf");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1);
		System.out.println(s1.toString());
		s1=s1.reverse();
		System.out.println(s1);
		String s3=new String(s1);
		System.out.println(s3);
		StringBuffer s4=new StringBuffer(s3);
		System.out.println(s4);
	}
}
