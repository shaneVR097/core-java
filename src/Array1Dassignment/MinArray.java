package Array1Dassignment;

public class MinArray {
	public int minarray(int[] a) {
		if(a.length==0 || a==null) {
			System.out.println("Array is null or 0 elements !!");
			return 0;
		}
		int mn=a[0];
		for(int i=0;i<a.length;i++)
			mn=(mn>a[i])?a[i]:mn;
		return mn;
	}
	public static void main(String[] args) {
		BasicArray ba=new BasicArray();
		int[] a=ba.create1d();
		ba.printarray(a);
		MinArray mina=new MinArray();
		System.out.println("\nMaximum element in Array is: "+mina.minarray(a));
	}
}

