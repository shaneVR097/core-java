package LoopingStmnts;

public class LengthOfaNumber {
	public static void main(String[] args) {
		int n1=-8,n2,s=0;
		n2=n1;
		if(n1<=0 && n1>=-9)
			s=1;
		else 
			do {
				s++;
				n2/=10;
			} while(n2!=0);
		System.out.println("Number of Digits in "+n1+" is = "+s);
	}
}
