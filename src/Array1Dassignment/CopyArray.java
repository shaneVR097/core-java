package Array1Dassignment;

public class CopyArray {
	public int[] copyarr(int[] a) {
		int[] ca=new int[a.length];
		for (int i = 0; i < a.length; i++)
			ca[i]=a[i];
		return ca;
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		CopyArray ca=new CopyArray();
		System.out.println("\nCopy Array: ");
		ba.printarray(ca.copyarr(a));
	}
}
