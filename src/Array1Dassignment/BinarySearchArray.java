package Array1Dassignment;

public class BinarySearchArray {
	public int binarysearch(int[] a,int e) {
		if(a.length==0 || a==null) {
			System.out.println("Array is null or 0 elements !!");
			return 0;
		}
		SortArray sa=new SortArray();
		int[] a2=sa.sortarray(a);
		int l=a2.length;
		int left = 0;
	    int right = l - 1;
		while (left <= right) {
	        int mid = left + (right - left) / 2;
	        
	        if (a2[mid] == e) {
	            return mid; 
	        } else if (e < a2[mid]) {
	            right = mid - 1; 
	        } else {
	            left = mid + 1; 
	        }
	    }
	    return -1;
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		//int[] a=ba.create1d();
		int[] a= {1,2,3,4,5,3,2};
		int e=4;
		ba.printarray(a);
		BinarySearchArray bs=new BinarySearchArray();
		int f=bs.binarysearch(a,e);
		System.out.println("\n\nElement "+e+((f==-1) ? " not found in array !!":" found in Array at: "+f));
	}
}
