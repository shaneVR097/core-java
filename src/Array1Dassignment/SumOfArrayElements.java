package Array1Dassignment;

public class SumOfArrayElements {
	public int sumarray(int[] a) {
		int s=0;
		for(int i=0;i<a.length;i++)
			s+=a[i];
		return s;
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		SumOfArrayElements sa=new SumOfArrayElements();
		System.out.println("\nSum of array elements are: "+sa.sumarray(a));
	}
}
