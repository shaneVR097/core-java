package conditionals;

public class SwitchStmnts {
	public static void main(String[] args) {
		int op=1,op2=2;
		switch(op) 
		{
			case 1:
				{
					System.out.println("c1");
				}
			case 2:
				{
					System.out.println("c2");
				}
			default:
				{
					System.out.println("no match");
				}
		}
		
		switch(op2) 
		{
			case 1:
					System.out.println("c1");
					System.out.println("c5");
				break;
			case 2:
				{
					System.out.println("c2");
				}
				break;
			default:
				{
					System.out.println("no match");
				}
				break;
		}		
	}
}
