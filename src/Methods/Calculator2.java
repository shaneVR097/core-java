package Methods;

public class Calculator2 {
	public static void add(int a,int b) {
		System.out.println("Sum of "+a+" and "+b+" is = "+ (a+b));
	}
	
	public static void sub(int a,int b) {
		System.out.println("Diff between "+a+" and "+b+" is = "+ (((a-b)>0) ? (a-b):(-(a-b))));
	}
	
	public static void mul(int a,int b) {
		System.out.println("Product of "+a+" and "+b+" is = "+ (a*b));
	}
	
	public static void div(int a,int b) {
		System.out.println("Division of "+a+" and "+b+" is = "+ (a/b));
	}
	
	public static void grtst(int a,int b,int c) {
		String res3 = (a>b && a>c) ? (a+ " is greatest") : ((b>c) ? (b+ " is greatest") : (c+ " is greatest"));
		System.out.println(res3);
	}
	
	public static void smlst(int a,int b,int c) {
		String res3 = (a<b && a<c) ? (a+ " is smallest") : ((b<c) ? (b+ " is smallest") : (c+ " is smallest"));
		System.out.println(res3);
	}
	
	public static void main(String[] args) {
		add(8,9);
		sub(6,7);
		mul(6,5);
		div(7,3);
		grtst(2,1,4);
		smlst(2,1,4);
	}
}
