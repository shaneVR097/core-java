package Methods;

public class ArmstrongChk {
	public static long pwr(long b,long p) {
		long p2=p;
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
	
	public static boolean arm(long n1) {
		boolean res=false;
		long n2=n1,s=0;
		long l=len(n1);
		while(n2>0) {
			s=s+pwr((long)(n2%10),l);
			n2/=10;
		}
		if(s==n1)
			res=true;
		else
			res=false;
		
		return res;
	}
	public static void main(String[] args) {
		long num=1634;
		boolean res=arm(num);
		System.out.println(" It is "+res+" that the number "+num+" is an Armstrong number ");
	}
}
