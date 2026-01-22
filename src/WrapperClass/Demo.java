package WrapperClass;

public class Demo {
	public static void main(String[] args) {
		int n=10;
		Integer i=n; //auto-boxing
		int n2=i; //auto-unboxing
		double d=i.doubleValue();
		System.out.println(d);
		Integer i2=101;
		System.out.println(i2);
		Boolean b=Boolean.valueOf("True");
		System.out.println(b);
		b=Boolean.valueOf("Tru");
		System.out.println(b);
		Integer k=Integer.parseInt("123a"); //number format exception
		try {
			System.out.println(k);
		} catch (NumberFormatException e) {
			System.out.println( "NumberFormatException handled !!");
		}
		String s=Integer.toString(n2);
		System.out.println(n2);
	}
}
