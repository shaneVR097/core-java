package Methods;

public class PowerRaise {
	public static long pwr(int b,int p) {
		int p2=p;
		long res=1;
		while(p2>0) {
			res=res*b;
			p2--;
		}
		return res;
	}
	public static void main(String[] args) {
		int b=20,p=3;
		System.out.println(b+" raised to the power "+p+" is = "+pwr(b,p));
	}
}
