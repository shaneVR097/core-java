package Array1Dassignment;

public class PrimeElementsArray {
	public boolean primechk(int a) {
		int i=1,f=0;
		while(i<=a) {
			if(a%i==0)
				f++;
			i++;
		}
		return (f==2) ? true: false;
	}
	public int[] primearray(int[] a,char p) {
		if(a.length==0 || a==null) {
			System.out.println("Array is null or 0 elements !!");
			return null;
		}
		
		int c=0;
		PrimeElementsArray pa=new PrimeElementsArray();
		for(int i=0;i<a.length;i++)
			if(pa.primechk(a[i]))
				c++;
		int[] prime=new int[c];
		for(int i=0;i<a.length;i++)
			if(pa.primechk(a[i]))
				prime[i]=a[i];
		if(p=='p' || p=='P') {
			if(prime!=null) {
				System.out.println("\nPrime elements in array are: ");
				BasicArray ba=new BasicArray();
				ba.printarray(prime);
			}
		}
		return prime;
	}
	public int[] primearray(int l,char p) {
		if(l==0) {
			System.out.println("Number of elements requested is 0!!");
			return null;
		}
		
		PrimeElementsArray pa=new PrimeElementsArray();
		int[] prime=new int[l];
		int num=2,count=0;
		while(count < l) {
	        if(pa.primechk(num)) {
	            prime[count] = num;  // Store the prime number
		        count++;
		    }
		    num++;  // Check next number
	    }
		if(p=='p' || p=='P') {
			if(prime!=null) {
				System.out.println("\nPrime array is: ");
				BasicArray ba=new BasicArray();
				ba.printarray(prime);
			}
		}
		return prime;
	}
	public static void main(String[] args) {
		PrimeElementsArray pa=new PrimeElementsArray();
		pa.primearray(10, 'p');
	}
}

