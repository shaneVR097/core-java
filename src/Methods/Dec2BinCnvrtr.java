package Methods;

public class Dec2BinCnvrtr {
	public static String d2b(int n1) {
		String res="";
		int n2=n1;
		while(n2>0) {
			if(n2%2==0)
				res=res+'0';
			else
				res=res+'1';
			n2/=2;
		}
		int l=res.length(),i=0;
		String res2="";
		while(i<l) {
			res2+=res.charAt(l-i-1);
			i++;
		}
		return res2;
	}
	public static void main(String[] args) {
		int num=32;
		System.out.println(d2b(num));
	}
}
