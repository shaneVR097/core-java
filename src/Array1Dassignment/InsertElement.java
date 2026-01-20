package Array1Dassignment;

public class InsertElement {
	public int[] addelm(int[] a,int e,int plc) {
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
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		BasicArray ba=new BasicArray();
		InsertElement ie=new InsertElement();
		ba.printarray(a);
		System.out.println("\nArray after adding 1 element: ");
		ba.printarray(ie.addelm(a, 7, 2));
	}
}


