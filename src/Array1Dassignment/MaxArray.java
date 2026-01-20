package Array1Dassignment;

public class MaxArray {
	public int maxarray(int[] a) {
		if(a.length==0 || a==null) {
			System.out.println("Array is null or 0 elements !!");
			return 0;
		}
		int mx=a[0];
		for(int i=0;i<a.length;i++)
			mx=(mx<a[i])?a[i]:mx;
		return mx;
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		MaxArray maxa=new MaxArray();
		System.out.println("\nMaximum element in Array is: "+maxa.maxarray(a));
	}
}
