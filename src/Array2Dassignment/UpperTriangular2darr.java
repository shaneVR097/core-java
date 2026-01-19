package Array2Dassignment;

public class UpperTriangular2darr {
	public int[][] uppertrg(int[][] a,char p) {
		Add2dArr ad=new Add2dArr();
	    if(a==null || a.length==0) {
	        System.out.println("Matrix is null or 0 rows");
	        return null;
	    }
	    if(!ad.notjagged(a)) {
			System.out.println("Cannot check diagonal on jagged array !!");
			return null;
		}
	    Diagonal2darr d=new Diagonal2darr();
	    if(!d.squarechk(a, 'n')){
			System.out.println("Cannot perform upper triangular conversion on non-square matrix !!");
			return null;
		}
	    int l=a.length;
	    int[][] ut=new int[l][l];
	    int i,j;
	    for(i=0;i<l;i++)
	    	for(j=0;j<l;j++) 
	    		ut[i][j]= (i>0 && j<i) ? 0:a[i][j];

	    if(p=='p' || p=='P') {
			Create2dArray c=new Create2dArray();
			System.out.println("Given array:- ");
			c.print2d(a);
			System.out.println("\nUpper Triangular array is: ");
			c.print2d(ut);
		}
	    return ut;
	}
	public static void main(String[] args) {
		int[][] a= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		UpperTriangular2darr u=new UpperTriangular2darr();
		u.uppertrg(a, 'p');
	}
}
