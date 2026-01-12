package Methods;

public class DisariumNumChk {
	public static String dachk(int n1) {
		int n2=n1,d=0,s=0,l=0,r=0;
		while(n2>0) {
			d=n2%10;
			r=r*10+d;
			n2/=10;
		}
		n2=r;
		while(n2>0) {
			d=n2%10;
			l++;
			int k=l,p=1;
			
			while(k>0) {
				p=p*d;
				k--;
			}
			s+=p;
			n2/=10;
		}
	
		return (s==n1) ? "Disarium no.":"Not a Disarium no.";
	}
	
	public static void main(String[] args) {
		int num=89;
		System.out.println(dachk(num));
	}
}
