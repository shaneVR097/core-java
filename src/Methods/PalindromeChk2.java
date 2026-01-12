package Methods;

public class PalindromeChk2 {
	public static String palchk(int n1) {
		int n2=n1,r=0;
		while(n2>0) {
			r=r*10+(n2%10);
			n2/=10;
		}
		return (r==n1) ? "true":"false";
	}
	
	public static void main(String[] args) {
		int num=2002;
		String res = palchk(num);
		System.out.println("It is "+res+" that "+num+" is a Palindrome Number.");
	}
}
