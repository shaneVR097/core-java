package Array1Dassignment;

public class NthlargestElement {
	public int nthlargestelement(int[] a,int k) {
		if(a==null || a.length==0) {
			System.out.println("Array is null or has 0 elements !!");
			return -1;
		}
		int l=a.length;
		SortArray sa=new SortArray();
		ReverseArray ra=new ReverseArray();
		int[] a2=ra.revarr(sa.sortarray(a),'n');
		if(k < 0) {
	        k = -k; 
	        k = l - k + 1;
	    }
	    
	    if(k == 0) {
	        k = 1;
	    }
	    
	    k = ((k - 1) % l) + 1;		
		return a2[k-1];
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a= {2,3,1,4,5};
		int k=3;
		ba.printarray(a);
		NthlargestElement nl=new NthlargestElement();
		int mx=nl.nthlargestelement(a,k);
		System.out.println("\n\n"+k+"th largest elemnt of the array is: "+mx);
	}
}

