package conditionals;

public class DivChkBy3and5 {
	public static void main(String[] args) {
		int num=45;
		if(num%3==0 && num%5==0)
			System.out.println(num+" is divisible by both 3 and 5");
		else
			System.out.println(num+" is not divisible by both 3 and 5");
	}
}
