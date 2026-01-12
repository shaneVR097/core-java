package LoopingStmnts;

public class OddNumbersN1toN2 {
	public static void main(String[] args) {
		int n1=3,n2=17;
		System.out.println("All Odd numbers between "+n1+" and "+n2+" are:- ");
		while(n1<=n2) {
			if(n1%2==1)
				System.out.println(n1);
			n1++;
		}
	}
}
