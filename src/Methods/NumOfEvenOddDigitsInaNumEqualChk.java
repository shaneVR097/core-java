package Methods;

public class NumOfEvenOddDigitsInaNumEqualChk {
	public static boolean NumOfEvenOddDigitsEqualChk(int n1){
		int n2=n1,e=0,o=0;
		
		while(n2>0) {
			if((n2%10)%2==0)
				e++;
			else
				o++;
			n2/=10;
		}
		
		return ((e==o) ? true : false);
	}
	
	public static void main(String[] args) {
		int num=1082;
		boolean res=NumOfEvenOddDigitsEqualChk(num);
		System.out.println("Number of even and odd digits in "+num+" is "+res);
		
	}
}
