package Methods;

public class XylemPhloemNumChk {
	public static String xpchk(int n1) {
		int n2=n1,s=0;
		int l=0,m=0;
		while(n2>0) {
			if(n2==n1)
				l=n2%10;
			else if(n2/10==0)
				m=n2;
			else
				s+=n2%10;
			n2/=10;
		}
	
		return (s==(l+m)) ? "Xylem no.":"Phloem no.";
	}
	
	public static void main(String[] args) {
		int num=1234;
		System.out.println(xpchk(num));
	}
}
