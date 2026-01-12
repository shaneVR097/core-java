package Methods;

public class CountNumOf1BitsInDecNum {
	public static int d2b1c(int n1) {
		int n2=n1,c=0;
		while(n2>0) {
			if(n2%2==1)
				c++;
			n2/=2;
		}
		return c;
	}
	public static void main(String[] args) {
		int num=311111;
		System.out.println(d2b1c(num));
	}
}
