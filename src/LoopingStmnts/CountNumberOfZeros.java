package LoopingStmnts;

public class CountNumberOfZeros {
	public static void main(String[] args) {
		int n1=-8007,n2,z=0;
		n2=n1;
		do {
			if(n2%10==0)
				z++;
			n2/=10;
		} while(n2!=0);
		System.out.println("Number of Zeros in "+n1+" is = "+z);
	}
}
