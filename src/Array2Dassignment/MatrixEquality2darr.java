package Array2Dassignment;

public class MatrixEquality2darr {
	public boolean equalitychk(int[][] a, int[][] b,char p) {
		Add2dArr ad=new Add2dArr();
	    if(a==null || a.length==0 || b==null || b.length==0) {
	        System.out.println("Either Matrix is null or 0 rows");
	        return false;
	    }
	    if(!ad.notjagged(a) && !ad.notjagged(b)) {
			System.out.println("Alert !! jagged array !!");
		}
	    if(!ad.sameorder(a, b)){
			System.out.println("Matrix size mismatch !!");
			return false;
		}
	    int lr=a.length;	
	    int i,j;
	    boolean res=true;
	    for(i=0;i<lr;i++) {
	    	int lc=a[i].length;
	    	for(j=0;j<lc;j++) {
	    		if(a[i][j]!=b[i][j]) {
	    			res=false;
	    			break;
	    		} else
	    			res=true;
	    	}
	    	if(res==false)
	    		break;
	    }
	    if(p=='p' || p=='P') {
			Create2dArray c=new Create2dArray();
			System.out.println("Given array-1 is:- ");
			c.print2d(a);
			System.out.println("\nGiven array-2 is:- ");
			c.print2d(b);
			System.out.println("\nThe given arrays are "+((res)?"equal":"not equal")+" matrix");
		}
		
		return res;
	}
	public static void main(String[] args) {
		int[][] a= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int[][] b= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		MatrixEquality2darr e=new MatrixEquality2darr();
		e.equalitychk(a,b, 'p');
	}
}


