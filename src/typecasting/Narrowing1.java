package typecasting;

public class Narrowing1 {
	public static void main(String[] args) {
		float f=98.79f;
		double d=f;
		System.out.println(d); 
		float f2=(float)d;
		System.out.println(f2);
	}
}
