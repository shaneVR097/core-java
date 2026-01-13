package Methods;

public class VarArgsExample {
	public static void add(String s,int... n) {
		int sm=0;
		for(int i:n) {
			System.out.print(i+" ");
			sm=sm+i;
		}
		System.out.println("\nSum is = "+sm);
	}
	public static void stradd(String... s) {
		String res="";
		for(String i:s) {
			System.out.print(i+" ");
			res=res+i+" ";
		}
		System.out.println("\nConcatenated String is = "+res);
	}
	public static void dblmaxmin(double... n) {
		double mx=n[0],mn=n[0];
		for(double i:n) {
			System.out.print(i+" ");
			if(mn>i)
				mn=i;
			if(mx<i)
				mx=i;
		}
		System.out.println("\nMax is = "+mx+" & Min is = "+mn);
	}
	public static void main(String[] args) {
		add("abc");
		add("abc",2,3,4,5);
		stradd("abc","xyz","mno");
		dblmaxmin(3.984,3.465,3.985);
	}
}
