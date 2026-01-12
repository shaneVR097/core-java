package operator1;

public class ConditionalOp {
	public static void main(String[] args) {
		int a=5,b=7,c=80,d=10;
		String res = (a>b) ? " a is greater than b" : "a is smaller than b";
		System.out.println(res);
		
		String res2 = (a>b) ? (a+ " is greater than "+ b) : (a+ " is smaller than "+ b);
		System.out.println(res2);
		
		String res3 = (a>b && a>c) ? (a+ " is greatest") : ((b>c) ? (b+ " is greatest") : (c+ " is greatest"));
		System.out.println(res3);
		
		String res4 = (a>b && a>c && a>d) ? (a+ " is greatest") : ((b>c && b>d) ? (b+ " is greatest") : ((c>d)?(c+" is greatest"):(d+" is greatest")));
		System.out.println(res4);
		
		int big1 = (a>b) ? a : b;
		big1 = (big1>c) ? big1 : c;
		big1 = (big1>d) ? big1 : d;
		System.out.println(big1+" is greatest");
	}
}
