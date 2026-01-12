package Methods;

public class StrongNumChk {
	public static String strngchk(int n1) {
		int n2=n1,r=0,d=0,f=0;
		while(n2>0) {
			d=(n2%10);
			f=1;
			while(d>0) {
				f=f*d;
				d--;
			}
			r+=f;
			n2/=10;
		}
		return (r==n1) ? "Strong no.":"Not Strong No.";
	}
	
	public static void main(String[] args) {
		int num=145;
		System.out.println(strngchk(num));
	}
}
