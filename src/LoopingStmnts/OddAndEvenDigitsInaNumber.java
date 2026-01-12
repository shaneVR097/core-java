package LoopingStmnts;

public class OddAndEvenDigitsInaNumber {
	public static void main(String[] args) {
		int n1=-789,n2,o=0,e=0;
		n2=n1;
		do {
			if((n2%10)%2==0)
				e++;
			else
				o++;
			n2/=10;
		} while(n2!=0);
		System.out.println(n1+" has "+e+" Even Digits and "+o+" Odd digits");
	}
}
