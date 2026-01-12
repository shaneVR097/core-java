package conditionals;

public class Calculator {
	public static void main(String[] args){
		int a=2,b=4;
		char ch='-';
		switch(ch) 
		{
			case '+':
				System.out.println("Sum is = "+(a+b));
				break;
			case '-':
				System.out.println("Diff is = "+(b-a));
				break;
			case '*':
				System.out.println("Mul is = "+(a*b));
				break;
			case '/':
				System.out.println("Div is = "+(b/a));
				break;
			case '%':
				System.out.println("Mod is = "+(b%a));
				break;
			default:
				System.out.println("no match");
				break;
		}
	}
}
