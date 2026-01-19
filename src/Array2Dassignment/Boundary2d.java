package Array2Dassignment;

public class Boundary2d {
	public void printBoundary(int[][] a) {
		Add2dArr ad=new Add2dArr();
		if(a==null || a.length==0) {
			System.out.println("Matrix is null or 0 rows");
			return;
		}
		if(!ad.notjagged(a))
			System.out.println("Array is jagged, boundaries are improper !!");
		int i,j,lr=a.length;
		System.out.println("\nBoundary array elements are: ");
		for(i=0;i<lr;i++) {
			int lc=a[i].length;
			for(j=0;j<lc;j++) {
				if(i==0 || i==(lr-1))
					System.out.print(a[i][j]+" ");
				else 
					if(j==0 || j==(lc-1))
						System.out.print(a[i][j]+" ");
					else if(j>0 && j<(lc-1))
						System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Create2dArray c=new Create2dArray();
		int[][] a=c.create2d();
		c.print2d(a);
		Boundary2d b=new Boundary2d();
		b.printBoundary(a);
	}
}
