package Array1D;

import java.util.Scanner;

public class AllArrayExample {

	// Integer array input + sum & product
	public static void intarr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();

		int s = 0, p = 1;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " element: ");
			a[i] = sc.nextInt();
		}

		System.out.print("Sum of ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ", ");
			s += a[i];
			p *= a[i];
		}
		System.out.println(" is: " + s + " and product is: " + p);
	}

	// Integer array (method overloading)
	public static void intarr(int[] a, int l) {
		int s = 0, p = 1;
		System.out.print("Sum of ");
		for (int i = 0; i < l; i++) {
			System.out.print(a[i] + ", ");
			s += a[i];
			p *= a[i];
		}
		System.out.println(" is: " + s + " and product is: " + p);
	}

	// Extract even elements
	public static int[] evenarr(int[] a, int l) {
		int e = 0;
		for (int i = 0; i < l; i++)
			if (a[i] % 2 == 0)
				e++;

		int[] even = new int[e];
		int j = 0;
		for (int i = 0; i < l; i++)
			if (a[i] % 2 == 0)
				even[j++] = a[i];

		return even;
	}

	// Reverse array in-place
	public static void revarr(int[] a) {
		int l = a.length;
		for (int i = 0; i < l / 2; i++) {
			int t = a[l - i - 1];
			a[l - i - 1] = a[i];
			a[i] = t;
		}
	}

	// Sum of digits for each element
	public static void digsumarr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int n = a[i], s = 0;
			while (n > 0) {
				s += n % 10;
				n /= 10;
			}
			a[i] = s;
		}
	}

	// Even & Odd sum
	public static void evenoddsumarr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();

		int se = 0, so = 0;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " element: ");
			a[i] = sc.nextInt();
		}

		System.out.print("Sum of even elements ");
		for (int i = 0; i < n; i++)
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + ", ");
				se += a[i];
			}
		System.out.println(" is: " + se);

		System.out.print("\nSum of odd elements ");
		for (int i = 0; i < n; i++)
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + ", ");
				so += a[i];
			}
		System.out.println(" is: " + so);
	}

	// Character array
	public static void chararr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();

		char[] c = new char[n];
		String res = "";

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " character: ");
			c[i] = sc.next().charAt(0);
		}

		System.out.print("Full character array is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(c[i] + " ");
			res += c[i];
		}
		System.out.println("\nFull String is: " + res);
	}

	// Character array overload
	public static void chararr(char[] c, int l) {
		String res = "";
		System.out.print("Full character array is: ");
		for (int i = 0; i < l; i++) {
			System.out.print(c[i] + " ");
			res += c[i];
		}
		System.out.println("\nFull String is: " + res);
	}

	// String array
	public static void stringarr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] str = new String[n];
		String res = "";

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " String: ");
			str[i] = sc.nextLine();
		}

		System.out.print("Full String array is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(str[i] + " ");
			res += " " + str[i];
		}
		System.out.println("\nFull String is:" + res);
	}

	// Boolean array AND operation
	public static void boolarr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();

		boolean res = true;
		boolean[] truth = new boolean[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " truth value: ");
			truth[i] = sc.nextBoolean();
			res = res && truth[i];
		}

		System.out.println("Ultimate truth value is: " + res);
	}

	// Zig-Zag merge (CORRECTED)
	public static int[] zigzag(int[] a, int[] b) {
		int la = a.length;
		int lb = b.length;

		int[] z = new int[la + lb];
		int i = 0, j = 0, k = 0;

		while (i < la && j < lb) {
			z[k] = a[i];
			k++;
			i++;
			z[k] = b[j];
			k++;
			j++;
		}

		while (i < la)
			z[k++] = a[i++];

		while (j < lb)
			z[k++] = b[j++];

//		System.out.println("\nZig-zagged elements are: ");
//		for (int x : z)
//			System.out.print(x + ", ");
		
		return z;
	}
	
	public static int[] bigsml(int[] a) {
		int mx=a[0],mn=a[0];
		for(int i=0;i<a.length;i++) {
			if(mn>a[i])
				mn=a[i];
			
			if(mx<a[i])
				mx=a[i];
		}
		
		int[] bs= {mn,mx};
		return bs;
	}
	
	public static int[] sortpostmerge(int[] a,int[] b) {
		int la=a.length;
		int lb=b.length;
		int[] spm = new int[la+lb];
		for(int i=0;i<la;i++) {
			spm[i]=a[i];
		}
		for(int i=0;i<lb;i++) {
			spm[la+i]=b[i];
		}
		
		for(int i=0;i<la+lb;i++) {
			for(int j=i+1;j<la+lb;j++) {
				if(spm[i]>spm[j]) {
					int t=spm[i];
					spm[i]=spm[j];
					spm[j]=t;
				}
			}
		}
		return spm;
	}
	
	public static void elementfrequency(int[] a) {
		int l = a.length;

		int mx = a[0];
		for (int i = 1; i < l; i++) {
			if (a[i] > mx)
				mx = a[i];
		}

		int[] freq = new int[mx + 1];

		// Correct frequency counting
		for (int i = 0; i < l; i++) {
			freq[a[i]]++;
		}

		for (int i = 0; i <= mx; i++) {
			if (freq[i] > 0)
				System.out.println("Frequency of " + i + " is: " + freq[i]);
		}
	}
	
	public static int[] removeduplicate(int[] a) {
		int l = a.length;

		int mx = a[0];
		for (int i = 1; i < l; i++) {
			if (a[i] > mx)
				mx = a[i];
		}

		int[] freq = new int[mx + 1];

		// Correct frequency counting
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
	
	public static int[] addelm(int[] a,int e,int plc) {
		int l=a.length;
		int[] a2=new int[l+1];
		for(int i=0;i<plc-1;i++) {
			a2[i]=a[i];
		}
		a2[plc-1]=e;
		for(int i=plc;i<l+1;i++) {
			a2[i]=a[i-1];
		}
		
		return a2;
	}
	
	public static int[] replelm(int[] a,int e,int plc) {
		int l=a.length;
		int[] a2=new int[l];
		for(int i=0;i<plc-1;i++) {
			a2[i]=a[i];
		}
		a2[plc-1]=e;
		for(int i=plc;i<l;i++) {
			a2[i]=a[i];
		}
		
		return a2;
	}
	
	public static int[] remvelm(int[] a,int plc) {
		int l=a.length;
		int[] a2=new int[l-1];
		for(int i=0;i<plc-1;i++) {
			a2[i]=a[i];
		}
		//a2[plc-1]=e;
		for(int i=plc;i<l;i++) {
			a2[i-1]=a[i];
		}
		
		return a2;
	}
	


	// MAIN
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		System.out.println("All elements are: ");
		for (int x : a)
			System.out.print(x + ", ");

		int[] even = evenarr(a, a.length);
		System.out.println("\nEven elements are: ");
		for (int x : even)
			System.out.print(x + ", ");

		revarr(a);
		System.out.println("\nReversed elements are: ");
		for (int x : a)
			System.out.print(x + ", ");

		int[] a3 = { 12, 34, 56, 78, 90 };
		digsumarr(a3);
		System.out.println("\nDigit sums are: ");
		for (int x : a3)
			System.out.print(x + ", ");

		int[] d = { 1, 2, 3 };
		int[] c = { 4, 5, 6,7 };
		int[] z=zigzag(c, d);
		System.out.println("\nZig-zagged elements are: ");
		for (int x : z)
			System.out.print(x + ", ");
		
		int[] bs=bigsml(a3);
		System.out.println("\nBiggest smallest elemnts are: ");
		for (int x : bs)
			System.out.print(x + ", ");
		
		int[] spm=sortpostmerge(c,d);
		System.out.println("\nMerged elements post sort are: ");
		for (int x : spm)
			System.out.print(x + ", ");
		
		System.out.println();
		int[] e = { 1,2,3,3,1 };
		elementfrequency(e);
		
		int[] uniq=removeduplicate(e);
		System.out.println("\nUnique elements are: ");
		for (int x : uniq)
			System.out.print(x + ", ");
		
		int[] f = { 1,2,3,3,1 };
		int[] a4=addelm(f,4,2);
		System.out.println("\nArray after adding elemnt is: ");
		for (int x : a4)
			System.out.print(x + ", ");
		
		int[] g = { 1,2,3,3,1 };
		int[] a5=replelm(g,4,2);
		System.out.println("\nArray after replacing elemnt is: ");
		for (int x : a5)
			System.out.print(x + ", ");
		
		int[] h = { 1,2,3,3,1,4,5 };
		int[] a6=remvelm(h,4);
		System.out.println("\nArray after removing elemnt is: ");
		for (int x : a6)
			System.out.print(x + ", ");
		
	}
}
