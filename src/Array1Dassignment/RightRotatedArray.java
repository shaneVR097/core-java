package Array1Dassignment;

import java.util.Arrays;

public class RightRotatedArray {
	public int[] rightrotated(int[] a,int rp,char p) {
		if(a==null || a.length==0) {
			System.out.println("Array is null or has 0 elements !!");
		}
		int l=a.length,r=rp;
		int[] ryt=new int[l];
		if(r%l==0) 
			ryt=a;
		else {
			r=r%l;
			if(r<0)
				r=r+l;
			for(int i=0;i<l;i++) {
				if((i+r)<l)
					ryt[i+r]=a[i];
			}
			for(int i=0;i<r;i++) {
				ryt[i]=a[l-r+i];
			}
		}
		if(p=='p' || p=='P') {
			if(ryt!=null) {
				BasicArray ba=new BasicArray();
				ba.printarray(a);
				System.out.println("\n\nRight rotated array after rotation by "+rp+" places: ");
				ba.printarray(ryt);
			}
		}
		return ryt;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		RightRotatedArray r=new RightRotatedArray();
		r.rightrotated(a, 12, 'p');
		r.rightrotated(a, -13, 'p');
		System.out.println("\n\n"+Arrays.equals(r.rightrotated(a, 12, 'n'),r.rightrotated(a, -13, 'n')));
	}
}
