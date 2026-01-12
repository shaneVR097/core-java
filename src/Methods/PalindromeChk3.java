package Methods;

public class PalindromeChk3 {
	public static String palchk(int n1) {
		int n2=n1,r=0;
		while(n2>0) {
			r=r*10+(n2%10);
			n2/=10;
		}
		return (r==n1) ? "Good":"Bad";
	}
	
	public static void main(String[] args) {
		int num=2002;
		System.out.println(palchk(num));
	}
}
