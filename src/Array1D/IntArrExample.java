package Array1D;
import java.util.Scanner;
public class IntArrExample {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter array size: ");
		 int n=sc.nextInt();
		 int s=0;
		 int[] a=new int[n];
		 for(int i=0;i<n;i++) {
			 System.out.println("Enter "+(i+1)+" element: ");
			 a[i]=sc.nextInt();
		 }
		 System.out.print("Sum of ");
		 for(int i=0;i<n;i++) {
			 System.out.print(a[i]+", ");
			 s+=a[i];
		 }
		 System.out.println(" is: "+s);
	 }
}
