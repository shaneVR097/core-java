package LoopingStmnts;

public class AverageOfDigitsInaNumber {
	public static void main(String[] args) {
		int n1=-307,n2,s=0,l=0;
		n2=n1;
		do {
			s+=(n2%10);
			n2/=10;
			l++;
		} while(n2!=0);
		System.out.println("Average of all digits of "+n1+" is = "+(float)s/l);
	}
}
