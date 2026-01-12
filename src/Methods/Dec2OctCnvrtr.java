package Methods;

public class Dec2OctCnvrtr {
	public static String d2o(int n1) {
		String res="";
		int n2=n1;
		while(n2>0) {
			int d=n2 % 8;
			res=res+(char)(d+'0');
			
			n2/=8;
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
		int num=1022;
		System.out.println(d2o(num));
	}
}
