package Methods;

public class Calculator3 {
	public static int add(int a,int b) {
		return (a+b);
	}
	
	public static int sub(int a,int b) {
		return (((a-b)>0) ? (a-b):(-(a-b))); 
	}
	
	public static int mul(int a,int b) {
		return (a*b);
	}
	
	public static int div(int a,int b) {
		return (a/b); 
	}
	
	public static int mod(int a,int b) {
		return (a%b); 
	}
	
	public static int grtst(int a,int b,int c) {
		return ( (a>b && a>c) ? (a) : ((b>c) ? (b) : (c)));
	}
	
	public static int smlst(int a,int b,int c) {
		return ( (a<b && a<c) ? (a) : ((b<c) ? (b) : (c)));
	}
	
	public static void main(String[] args) {
		int a=2,b=4;
		char ch='/';
		switch(ch) 
		{
			case '+':
				System.out.println("Sum is = "+add(a,b));
				break;
			case '-':
				System.out.println("Diff is = "+sub(b,a));
				break;
			case '*':
				System.out.println("Mul is = "+mul(a,b));
				break;
			case '/':
				System.out.println("Div is = "+div(b,a));
				break;
			case '%':
				System.out.println("Mod is = "+mod(b,a));
				break;
			default:
				System.out.println("no match");
				break;
		}
	}
}
