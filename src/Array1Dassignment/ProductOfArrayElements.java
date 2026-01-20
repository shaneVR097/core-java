package Array1Dassignment;

public class ProductOfArrayElements {
	public long prodarray(int[] a) {
		long s=1;
		for(int i=0;i<a.length;i++)
			s*=a[i];
		return s;
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		ProductOfArrayElements pa=new ProductOfArrayElements();
		System.out.println("\nProduct of array elements are: "+pa.prodarray(a));
	}
}


