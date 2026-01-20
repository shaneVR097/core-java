package Array1Dassignment;

public class ElementFrequencyArray {
	public void elementfrequency(int[] a) {
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
			if (freq[i] > 0)
				System.out.println("Frequency of " + i + " is: " + freq[i]);
		}
	}
	
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		ElementFrequencyArray ef=new ElementFrequencyArray();
		System.out.println("\nFrequency of Elements in array:");
		ef.elementfrequency(a);
		
	}
}
