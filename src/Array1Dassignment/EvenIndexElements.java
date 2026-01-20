package Array1Dassignment;

public class EvenIndexElements {
	public void printevenidx(int[] a) {
		for(int i=0;i<a.length;i++) {
			if((i+1)%2==0)
				System.out.println((i+1)+"-position element: "+a[i]);
		}
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		EvenIndexElements ep=new EvenIndexElements();
		ep.printevenidx(a);
	}
}
