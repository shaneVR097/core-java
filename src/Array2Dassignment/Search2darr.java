package Array2Dassignment;

public class Search2darr {
	public boolean search2d(int[][] a,int e,char p) {
		if(a==null || a.length==0) {
	        System.out.println("Matrix is null or 0 rows");
	        return false;
	    }
		boolean res=false;
		int lr=a.length,i,j;
		for(i=0;i<lr;i++) {
			int lc=a[i].length;
			for(j=0;j<lc;j++) {
				if(a[i][j]==e) {
					res=true;
					break;
				}
				if(res==true)
					break;
			}
		}
		if(p=='p' || p=='P') {
			Create2dArray c=new Create2dArray();
			System.out.println("Given array:- ");
			c.print2d(a);
			System.out.println("\nElement "+e+" is "+((res)?"found":"not found")+" in matrix");
		}
		return res;
	}
	public static void main(String[] args) {
		Create2dArray c=new Create2dArray();
		int[][] a=c.create2d();
		c.print2d(a);
		Search2darr srch = new Search2darr();
		int e=8;
		srch.search2d(a,e,'p');
	}
}
