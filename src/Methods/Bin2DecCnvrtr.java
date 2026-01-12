package Methods;

public class Bin2DecCnvrtr {
	public static int b2d(String n1) {
		int l=n1.length(),i=0,d=0,p=1;
		while(i<l) {
			char c=n1.charAt(l-i-1);
			if(c=='1')
				d=d+p;
			p=p*2;
			i++;
		}
		return d;
	}
	public static void main(String[] args) {
		String bin="1111111111111111111111111111111";
		System.out.println(b2d(bin));
	}
}
