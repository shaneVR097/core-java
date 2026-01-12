package Methods;

public class HappyNumChk {
	public static String hpychk(int n1) {
		int n2=n1,r=0,d=0;
		while(n2!=1 && n2!=145) {
			r=0;
			while(n2>0) {
				d=(n2%10);
				r=r+d*d;
				n2/=10;
			}
			n2=r;
		}
		return (r==1) ? "Happy no.":"Not Happy No.";
	}
	
	public static void main(String[] args) {
		int num=7;
		System.out.println(hpychk(num));
	}
}
