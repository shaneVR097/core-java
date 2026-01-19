package Array2Dassignment;

public class LowerTriangular2darr {
	public int[][] lowertrg(int[][] a,char p) {
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
			System.out.println("Cannot perform lower triangular conversion on non-square matrix !!");
			return null;
		}
	    int l=a.length;
	    int[][] lt=new int[l][l];
	    int i,j;
	    for(i=0;i<l;i++)
	    	for(j=0;j<l;j++)
	    		lt[i][j]=(i>=j) ? a[i][j] : 0; 
	    
	    if(p=='p' || p=='P') {
			Create2dArray c=new Create2dArray();
			System.out.println("Given array:- ");
			c.print2d(a);
			System.out.println("\nLower Triangular array is: ");
			c.print2d(lt);
		}
	    return lt;
	}
	public static void main(String[] args) {
		int[][] a= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		LowerTriangular2darr l=new LowerTriangular2darr();
		l.lowertrg(a, 'p');
	}
}

