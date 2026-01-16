package Polymorphism;

public class FindMax {
	public static int max(int a,int b) {
		return (a>b) ? a:b;
	}
	
	public static int max(int a,int b,int c) {
		return max(a,max(b,c)) ;
	}
	
	public static float max(int a,float b) {
		return ((float)a>b) ? (float)a:b;
	}
	
	public static void main(String[] args) {
		System.out.println(max(1,2));
		System.out.println(max(3,4,2));
		System.out.println(max(1,2.3f));
		
	}
}
