package Array2Dassignment;

public class Identity2darr  {
	public boolean identity2d(int[][] a,char p){
		Add2dArr ad=new Add2dArr();
		if(!ad.notjagged(a)) {
			System.out.println("Cannot perform identity matrix check on jagged array !!");
			return false;
		}
		boolean res=true;
		int lr=a.length,lc=a[0].length;
		for(int i=0;i<lr;i++)
			for(int j=0;j<lc;j++)
				if(i==j)
					if(a[i][j]!=1)
						res=false;
				else if(i!=j)
					if(a[i][j]!=0)
						res=false;
		
		if(p=='p' || p=='P') {
			Create2dArray c=new Create2dArray();
			System.out.println("Given array:- ");
			c.print2d(a);
			System.out.println("The given array is "+((res)?"an identity":"not an identity")+" matrix");
		}
		
		return res;
	}
	public static void main(String[] args) {

		Identity2darr i=new Identity2darr();
		int[][] a= {{0,1},{1,0}};
		i.identity2d(a, 'p');

		int[][] b= {{1,0,0},{0,1,0},{0,0,1}};
		i.identity2d(b, 'p');
		
		int[][] c= {{1,0,0},{1,0},{0,0,1}};
		i.identity2d(c, 'p');		
	}
}