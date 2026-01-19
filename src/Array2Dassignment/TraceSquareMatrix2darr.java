package Array2Dassignment;

public class TraceSquareMatrix2darr {
	public int tracesquare(int[][] a,char p) {
		Add2dArr ad=new Add2dArr();
	    if(a==null || a.length==0) {
	        System.out.println("Matrix is null or 0 rows");
	        return 0;
	    }
	    if(!ad.notjagged(a)) {
			System.out.println("Cannot check trace on jagged array !!");
			return 0;
		}
	    Diagonal2darr d=new Diagonal2darr();
	    if(!d.squarechk(a, 'n')){
			System.out.println("Cannot check trace on non-square matrix !!");
			return 0;
		}
	    int l=a.length;
	    int i,j,s=0;
	    for(i=0;i<l;i++)
	    	for(j=0;j<l;j++) 
	    		s+= (i==j) ? a[i][j]:0;

	    if(p=='p' || p=='P') {
			Create2dArray c=new Create2dArray();
			System.out.println("Given array:- ");
			c.print2d(a);
			System.out.println("\ntrace of square matrix is: "+s);
		}
	    return s;
	}
	public static void main(String[] args) {
		int[][] a= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		TraceSquareMatrix2darr sq=new TraceSquareMatrix2darr();
		sq.tracesquare(a, 'p');
	}
}
