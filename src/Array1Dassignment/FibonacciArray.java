package Array1Dassignment;

public class FibonacciArray {
	
	public int[] fibonacciarray(int l,char p) {
		if(l<2) {
			System.out.println("Number of elements requested is less than 2 for fibonacci!!");
			return null;
		}
		
		int[] fib=new int[l];
		if (l >= 1) fib[0] = 0;
	    if (l >= 2) fib[1] = 1;
	    
	    for (int i = 2; i < l; i++) {
	        fib[i] = fib[i-1] + fib[i-2];
	    }
	    
	    if(p=='p' || p=='P') {
			if(fib!=null) {
				System.out.println("\nFibonacci array is: ");
				BasicArray ba=new BasicArray();
				ba.printarray(fib);
			}
		}
		return fib;
	}
	public static void main(String[] args) {
		FibonacciArray fa=new FibonacciArray();
		fa.fibonacciarray(10, 'p');
	}
}


