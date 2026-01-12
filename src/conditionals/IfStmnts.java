package conditionals;

public class IfStmnts {
	public static void main(String[] args) {
		int a=5,b=6,c=7,d=8;
		if(a>b)
			System.out.println(a+" is greatest");
		
		if(a>b)
			System.out.println(a+" is greatest");
		else
			System.out.println(b+" is greatest");
		
		if(a>b && a>c)
			System.out.println(a+" is greatest");
		else 
			if(b>c)
				System.out.println(b+" is greatest");
			else
				System.out.println(c+" is greatest");
		
		//greatest of 4 using only if statement and 1 extra variable 
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		if(d>big)
			big=d;
		System.out.println(big+" is greatest");
		
		char ch='A';
		if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z'))
			System.out.println(ch+" is alphabet");
		else if(ch>='0'&&ch<='9')
			System.out.println(ch+" is numeral");
		else 
			System.out.println(ch+" is Special character");
		
			
	}
}
