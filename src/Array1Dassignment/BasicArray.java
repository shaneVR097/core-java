package Array1Dassignment;
import java.util.Scanner;
public class BasicArray {
	Scanner sc=new Scanner(System.in);
	public int[] create1d() {
		System.out.println("\nEnter array length: ");
		int l=sc.nextInt();
		int[] a=new int[l];
		for(int i=0;i<l;i++) {
			System.out.println("Enter "+(i+1)+" element into array: ");
			a[i]=sc.nextInt();
		}
		return a;
	}
	public int[] create1d(int l) {
		int[] a=new int[l];
		for(int i=0;i<l;i++) {
			System.out.println("Enter "+(i+1)+" element into array: ");
			a[i]=sc.nextInt();
		}
		return a;
	}
	public void printarray(int[] a) {
		System.out.println("\nGiven array:-\n");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public void closescanner() {
		sc.close();
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
	}
}
