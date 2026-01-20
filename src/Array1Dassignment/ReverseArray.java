package Array1Dassignment;

public class ReverseArray {
	public void revarr(int[] a) {
		int l = a.length;
		for (int i = 0; i < l / 2; i++) {
			int t = a[l - i - 1];
			a[l - i - 1] = a[i];
			a[i] = t;
		}
	}
	public int[] revarr(int[] a,char c) {
		int l=a.length;
		int[] rac =new int[l];
		for (int i = 0; i < l; i++) {
			rac[i] = a[l - i - 1];
		}
		return rac;
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		ReverseArray ra=new ReverseArray();
		ra.revarr(a);
		System.out.println("\nArray after reversal of elements are: ");
		ba.printarray(a);
		int[] b=ba.create1d();
		ba.printarray(b);
		int[] rac=ra.revarr(b, 'c');
		System.out.println("\nArray after reversal of elements are: ");
		ba.printarray(rac);
	}
}
