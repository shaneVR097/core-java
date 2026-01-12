package Methods;

public class Dec2HexCnvrtr {
	public static String d2x(int n1) {
		String res="";
		int n2=n1;
		while(n2>0) {
			int d=n2 % 16;
			
			if(d<10)
				res=res+(char)(d+'0');
			else
				res=res+(char)(d-10+'A');
			
			n2/=16;
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
		int num=1702;
		System.out.println(d2x(num));
	}
}
