package Methods;

public class StaticVarExample2 {
	static String name="Max";
	static {
		System.out.println("StaticVarExample2");
		System.out.println("palindrome & Prime Checking methods in this class"); //static block is called before main, only once and can't be explicitly called 
		
	}
	public static int add(int... n) {
		int sm=0;
		for(int i:n) {
			sm+=i;
		}
		return sm;
	}
	public static boolean palchk(int n) {
		int n2=n,r=0;
		while(n2>0) {
			r=r*10+n2%10;
			n2/=10;
		}
		return (r==n) ? true : false;
	}
	public static boolean primechk(int n) {
		int n2=n,i=1,f=0;
		while(i<=n2) {
			if(n2%i==0)
				f++;
			i++;
		}
		return (f==2) ? true : false;
	}
}
