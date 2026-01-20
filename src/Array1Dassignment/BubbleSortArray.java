package Array1Dassignment;

public class BubbleSortArray {
	public int[] bubblesort(int[] a) {
		if(a==null || a.length==0) {
			System.out.println("Array is null or has 0 elements !!");
		}
		int l=a.length;
		int[] a2=a;
		for(int i = 0; i < l - 1; i++) {
		    for(int j = 0; j < l - i - 1; j++) {
		        if(a[j] > a[j + 1]) {
		            int t = a[j];
		            a[j] = a[j + 1];
		            a[j + 1] = t;
		        }
		    }
		}
		return a2;
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a= {2,3,1,1,4,5};
		ba.printarray(a);
		BubbleSortArray bsa=new BubbleSortArray();
		int[] a2=bsa.bubblesort(a);
		System.out.println("\n\nSorted array is:-");
		ba.printarray(a2);
	}
}
