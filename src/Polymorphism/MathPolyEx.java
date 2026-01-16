package Polymorphism;

public class MathPolyEx {
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void add(float a,float b) {
		System.out.println(a+b);
	}
	
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void add(float a,float b, float c) {
		System.out.println(a+b+c);
	}
	
	public static int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	
	public static float add(float a,float b,float c,float d) {
		return a+b+c+d;
	}
	
	public void add(int a,int b,float c,float d,int e) {
		System.out.println(a+b+c+d+e);
	}
	
	public static void main(String[] args) {
		add(2,3);
		add(2,3,4);
		add(1.1f,2.2f);
		add(2.3f,3.4f,5.6f);
		
		System.out.println(add(2,3,4,5));
		System.out.println(add(2.2f,3.2f,4.1f,5.6f));
		
		MathPolyEx m=new MathPolyEx();
		m.add(1,2,3.3f,4.4f,5);
		
	}
	
	
}
