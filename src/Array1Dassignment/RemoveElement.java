package Array1Dassignment;

public class RemoveElement {

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
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		BasicArray ba=new BasicArray();
		RemoveElement re=new RemoveElement();
		ba.printarray(a);
		System.out.println("\nArray after removing 1 element: ");
		ba.printarray(re.remvelm(a, 2));
	}
}



