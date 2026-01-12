package conditionals;

public class NumberOfDigits {
	public static void main(String[] args) {
		int num=10;
		if(num>=-9 && num<=9)
			System.out.println(num+" is a Single digit number");
		else if((num<=-9 && num>=-99) || (num>=9 && num<=99))
			System.out.println(num+" is a Double digit number");
		else
			System.out.println(num+" has more than 2 digits");
	}
}
