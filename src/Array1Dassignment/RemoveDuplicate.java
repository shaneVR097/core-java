package Array1Dassignment;

public class RemoveDuplicate {
	public int[] removeduplicate(int[] a) {
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
		
		return uniq;
	}

	
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		RemoveDuplicate rd=new RemoveDuplicate();
		int[] uniq=rd.removeduplicate(a);
		System.out.println("\nUnique Elements in array:");
		ba.printarray(uniq);
		
	}
}

