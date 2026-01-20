package Array2Dassignment;

public class SadlePt2darr {
	public int saddlept(int[][] a, char p) {
	    if (a == null || a.length == 0) {
	        System.out.println("Matrix is null or empty!");
	        return -1;
	    }
	    int sdl = -1;  
	    int i, j;
	    int lr = a.length;
	    
	    for (i = 0; i < lr; i++) {
	        int lc = a[i].length;
	        
	        // Find minimum in current row
	        int rowMin = a[i][0];
	        int minColIndex = 0;
	        
	        for (j = 1; j < lc; j++) {
	            if (a[i][j] < rowMin) {
	                rowMin = a[i][j];
	                minColIndex = j;
	            }
	        }
	        
	        // Check if this row minimum is also column maximum
	        boolean isColMax = true;
	        for (int k = 0; k < lr; k++) {
	            // Check if column exists in this row
	            if (minColIndex < a[k].length) {
	                if (a[k][minColIndex] > rowMin) {
	                    isColMax = false;
	                    break;
	                }
	            }
	        }
	        
	        if (isColMax) {
	            sdl = rowMin;  // Found saddle point
	            break;  // Only one saddle point possible
	        }
	    }
	    
	    // ========== OUTPUT ==========
	    if (p == 'p' || p == 'P') {
	        Create2dArray c = new Create2dArray();
	        System.out.println("\nGiven array is:-");
	        c.print2d(a);
	        
	        if (sdl != -1) {
	            System.out.println("\nSaddle point of given array is: " + sdl);
	        } else {
	            System.out.println("\nNo saddle point found!");
	        }
	    }
	    
	    return sdl;
	}
	
	public static void main(String[] args) {
//		Create2dArray c=new Create2dArray();
		//c.create2d();
		int[][] a= {{9,7,6},{5,2,3},{4,1,8}};
		SadlePt2darr sdl=new SadlePt2darr();
		sdl.saddlept(a, 'p');
	}
}
