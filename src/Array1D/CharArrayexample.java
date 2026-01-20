package Array1D;
import java.util.Scanner;
public class CharArrayexample {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter array size: ");
		 int n=sc.nextInt();
		 char[] c=new char[n];
		 String res="";
		 for(int i=0;i<n;i++) {
			 System.out.println("Enter "+(i+1)+" character: ");
			 c[i]=sc.next().charAt(0);
		 }
		 System.out.print("Full character array is: ");
		 for(int i=0;i<n;i++) {
			 System.out.print(c[i]+" ");
			 res=res+c[i];
		 }
		 System.out.println("\nFull String is: "+res);
		 sc.close();
	 }
}
