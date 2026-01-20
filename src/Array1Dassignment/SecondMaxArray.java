package Array1Dassignment;

public class SecondMaxArray {
	public int secondmaxarray(int[] a) {
		if(a.length==0 || a==null) {
			System.out.println("Array is null or 0 elements !!");
			return 0;
		}
		int mx=a[0],smx=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mx) {
                smx = mx; 
                mx = a[i];
            } else if (a[i] > smx && a[i] < mx) {
                smx = a[i];
            }
        }
        return smx;
	}
		
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		SecondMaxArray smaxa=new SecondMaxArray();
		System.out.println("\nSecond Maximum element in Array is: "+smaxa.secondmaxarray(a));
	}
}

