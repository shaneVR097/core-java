package LoopingStmnts;

public class Sum1toN {
	public static void main(String[] args) {
		int i=1,n1=3,s=0;
		if(n1<1) {
			System.out.println("Upper limit lower than 1 !");
			return;
		}			
		
		do {
			s+=i;
			i++;
		} while(i<=n1);
		System.out.println("Sum of all numbers between "+1+" and "+n1+" is = "+s);
	}
}
