package Array1Dassignment;

public class DuplicateElements {
	public void duplicate(int[] a) {
		int l = a.length;

		int mx = a[0];
		for (int i = 1; i < l; i++) {
			if (a[i] > mx)
				mx = a[i];
		}

		int[] freq = new int[mx + 1];

		for (int i = 0; i < l; i++) {
			freq[a[i]]++;
		}

		for (int i = 0; i <= mx; i++) {
			if (freq[i] > 1)
				System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		//int[] a=ba.create1d();
		int[] a= {1,2,2,3,1,4,5};
		ba.printarray(a);
		DuplicateElements de=new DuplicateElements();
		System.out.println("\nDuplicate Elements in array:");
		de.duplicate(a);
		
	}
}

