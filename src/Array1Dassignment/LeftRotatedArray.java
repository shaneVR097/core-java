package Array1Dassignment;
import java.util.Arrays;
public class LeftRotatedArray {
	public int[] leftrotated(int[] a,int lp,char p) {
		if(a==null || a.length==0) {
			System.out.println("Array is null or has 0 elements !!");
		}
		int n=a.length,l=lp;
		int[] lft=new int[n];
		if(l%n==0) 
			lft=a;
		else {
			l=l%n;
			if(l<0)
				l=l+n;
			for(int i=l;i<n;i++) {
					lft[i-l]=a[i];
			}
			for(int i=0;i<l;i++) {
				lft[n-l+i]=a[i];
			}
		}
		if(p=='p' || p=='P') {
			if(lft!=null) {
				BasicArray ba=new BasicArray();
				ba.printarray(a);
				System.out.println("\n\nLeft rotated array after rotation by "+lp+" places: ");
				ba.printarray(lft);
			}
		}
		return lft;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		LeftRotatedArray l=new LeftRotatedArray();
		l.leftrotated(a, 12, 'p');
		l.leftrotated(a, -13, 'p');
		System.out.println("\n\n"+Arrays.equals(l.leftrotated(a, 12, 'n'),l.leftrotated(a, -13, 'n')));
	}
}


