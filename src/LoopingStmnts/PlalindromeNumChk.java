package LoopingStmnts;

public class PlalindromeNumChk {
	public static void main(String[] args) {
		int n1=12321,n2,rev=0;
		n2=n1;
		while(n2!=0) {
			rev=rev*10+(n2%10);
			n2/=10;
		}
		System.out.println(n1+" is "+((rev==n1) ? " a Palindrome Number" :"Not a Palindrome Number"));
	}
}
