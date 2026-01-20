package Array1Dassignment;

public class OddIndexElements {
	public void printoddidx(int[] a) {
		for(int i=0;i<a.length;i++) {
			if((i+1)%2==1)
				System.out.println((i+1)+"-position element: "+a[i]);
		}
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		OddIndexElements op=new OddIndexElements();
		op.printoddidx(a);
	}
}
