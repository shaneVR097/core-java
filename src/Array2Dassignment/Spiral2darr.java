package Array2Dassignment;

public class Spiral2darr {
	public void printspiral(int[][] a) {
	    if(a==null || a.length==0) {
	        System.out.println("Matrix is null or 0 rows");
	        return;
	    }
	    
	    int top = 0, bottom = a.length - 1;
	    int left = 0, right = a[0].length - 1;
	    
	    Create2dArray c=new Create2dArray();
	    System.out.println("\nOriginal array elements are: ");
	    c.print2d(a);
	    System.out.println("\nSpiral order array elements are: ");
	    
	    while(top <= bottom && left <= right) {
	        // 1. Print top row (left → right)
	        for(int i = left; i <= right; i++) {
	            System.out.print(a[top][i] + " ");
	        }
	        top++;
	        
	        // 2. Print right column (top → bottom)
	        for(int i = top; i <= bottom; i++) {
	            System.out.print(a[i][right] + " ");
	        }
	        right--;
	        
	        // 3. Print bottom row (right → left) - if still rows left
	        if(top <= bottom) {
	            for(int i = right; i >= left; i--) {
	                System.out.print(a[bottom][i] + " ");
	            }
	            bottom--;
	        }
	        
	        // 4. Print left column (bottom → top) - if still columns left
	        if(left <= right) {
	            for(int i = bottom; i >= top; i--) {
	                System.out.print(a[i][left] + " ");
	            }
	            left++;
	        }
	    }
	    System.out.println();
	}
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		Spiral2darr s=new Spiral2darr();
		s.printspiral(a);
	}
}
