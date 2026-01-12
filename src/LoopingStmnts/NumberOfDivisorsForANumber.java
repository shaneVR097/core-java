package LoopingStmnts;

public class NumberOfDivisorsForANumber {
	public static void main(String[] args) {
		int n1=98,d=0;
		for(int i=1;i<=n1;i++) {
			if(n1%i==0)
				d++;
		}
		System.out.println("Number of Divisors for "+n1+" is = "+d);
	}
}
