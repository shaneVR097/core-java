package Array1Dassignment;

public class UniqueElementsArray {
	public void printunique(int[] a) {
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
		
		int u=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0)
				u++;
		}
		
		int[] uniq=new int[u];
		int j=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0)
				uniq[j++]=i;
		}
		System.out.println("\nUnique elements of array are: ");
		for(int i=0;i<uniq.length;i++) {
			System.out.print(uniq[i]+" ");
		}
	}

	
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		UniqueElementsArray ua=new UniqueElementsArray();
		ua.printunique(a);
		
	}
}

