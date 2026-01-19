package Array2Dassignment;

public class NumOfZeroInBinaryMat {
	public int zerocount(int[][] a,char p) {
	    if (a == null || a.length == 0) {
	        System.out.println("Matrix is null or empty!");
	        return -1;
	    }
		int z=0;
		int lr=a.length;
		int i,j;
		for(i=0;i<lr;i++) {
			if(z==-1)
				break;
			int lc=a[i].length;
			for(j=0;j<lc;j++) {
				if(a[i][j]>=0 && a[i][j]<=1) {
					if(a[i][j]==0)
						z++;
					
				} else {
					System.out.println("Non-binary matrix !!");
					z=-1;
					break;
				}
			}

		}
		if(p=='p' || p=='P') {
			Create2dArray c = new Create2dArray();
	        System.out.println("\nGiven array is:-");
	        c.print2d(a);
	        if (z>-1) {
	            System.out.println("\nNumber of zeros in given array is: " + z);
	        } 
		}
		return z;
		
	}
	
	public static void main(String[] args) {
		Create2dArray c=new Create2dArray();
		//c.create2d();
		int[][] a= {{1,1,0},{0,1,1},{1,0,1}};
		NumOfZeroInBinaryMat nz=new NumOfZeroInBinaryMat();
		nz.zerocount(a, 'p');
	}
	
}
