package Array1Dassignment;

public class SortArray {
	public int[] sortarray(int[] a) {
		if(a==null || a.length==0) {
			System.out.println("Array is null or has 0 elements !!");
		}
		int l=a.length;
		int[] a2=a;
		for(int i=0;i<l;i++)
			for(int j=i+1;j<l;j++)
				if(a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
		return a2;
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		SortArray sa=new SortArray();
		int[] a2=sa.sortarray(a);
		System.out.println("\n\nSorted array is:-");
		ba.printarray(a2);
	}
}
