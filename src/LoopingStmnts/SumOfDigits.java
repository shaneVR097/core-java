package LoopingStmnts;

public class SumOfDigits {
	public static void main(String[] args) {
		int n1=30,n2,s=0;
		n2=n1;
		do {
			s+=(n2%10);
			n2/=10;
		} while(n2>0);
		System.out.println("Sum of all digits of "+n1+" is = "+s);
	}
}
