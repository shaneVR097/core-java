package operator1;

public class op1 {
	public static void main(String[] args) {
		int a=1,b=2,c=3,d=4;
		System.out.println("Arithmetic operators: ");
		System.out.println("Sum: "+(a+b)+" | Mul: "+(a*b)+" | Sub: "+(b-a)+" | Div: "+d/b +" | Modulo: "+d%c+"\n");
		float f=9.1f,g=8.7f,h=3.1f,i=7.6f;
		System.out.println("Relational operators: ");
		System.out.println("1: "+(a>b));
		System.out.println("2: "+(b<c));
		System.out.println("3: "+(f==f));
		System.out.println("4: "+(a!=a)+"\n");
		System.out.println("Logical operators: ");
		System.out.println("5: "+((a>b)&&(b<c)));
		System.out.println("6: "+((a<b)||(b>c)));
		System.out.println("7: "+((f==f)&&(g==g)));
		System.out.println("8: "+((f>=g)&&(g<=h)));
		System.out.println("9: "+((a!=b)||(b!=c)));
		System.out.println("10: "+(!(a>b)));
		System.out.println("11: "+(!(f==f))+"\n");
		System.out.println("Compounded Assignment operators: ");
		System.out.println("12: "+(a+=b));
		System.out.println("13: "+(d/=b));
		System.out.println("14: "+(a-=c));
		System.out.println("15: "+(d*=b));
	}
}
