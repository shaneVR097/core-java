package Methods;

public class LengthOfaNum2 {
	public static long pwr(int b,int p) {
		int p2=p;
		long res=1;
		while(p2>0) {
			res=res*b;
			p2--;
		}
		return res;
	}
	public static long len(long n1) {
		long n2=n1;
		long l=0;
		while(n2>0) {
			l++;
			n2/=10;
		}
		return l;
	}
	public static void main(String[] args) {
		int b=20,p=3;
		System.out.println(b+" raised to the power "+p+" is = "+pwr(b,p));
		System.out.println("Length of "+pwr(b,p)+" is = "+len(pwr(b,p)));
		
	}
}
