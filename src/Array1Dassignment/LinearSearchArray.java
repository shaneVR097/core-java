package Array1Dassignment;

public class LinearSearchArray {
	public int linearsearch(int[] a,int e) {
		if(a.length==0 || a==null) {
			System.out.println("Array is null or 0 elements !!");
			return 0;
		}
		int pos=-1;
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			if(e==a[i]) {
				pos=i+1;
				found=true;
			}
			if(found)
				break;
		}
		return pos;
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		//int[] a=ba.create1d();
		int[] a= {1,2,3,4,5,3,2};
		int e=6;
		ba.printarray(a);
		LinearSearchArray ls=new LinearSearchArray();
		int f=ls.linearsearch(a,e);
		System.out.println("\n\nElement found in Array at: "+((f==-1) ? "not found !!":f));
	}
}