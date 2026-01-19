package Array2Dassignment;

public class Diagonal2darr {
	public boolean squarechk(int[][] a,char p) {
		Add2dArr ad=new Add2dArr();
		if(a==null || a.length==0) {
			System.out.println("Matrix is null or 0 rows");
			return false;
		}
		if(!ad.notjagged(a)) {
			System.out.println("Cannot check diagonal on jagged array !!");
			return false;
		}
		boolean res=true;
		if(a.length!=a[0].length)
			res=false;
		else
			res=true;
		if(p=='p' || p=='P') {
			Create2dArray c=new Create2dArray();
			System.out.println("Given array:- ");
			c.print2d(a);
			System.out.println("The given array is "+((res)?"a square":"not a square")+" matrix");
		}
		return res;
	}
	public int[][] diag2d(int[][] a,char p) {
		if(!squarechk(a, 'n'))
			return null;
		int l=a.length;
		int[][] d=new int[2][l];
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++) {
				if(i==j)
					d[0][i]=a[i][j];
			}
		for(int i=0;i<l;i++)
			for(int j=0;j<l;j++) {
				if((i+j)==(l-1))
					d[1][i]=a[i][j];
			}
		if(p=='p' || p=='P') {
			Create2dArray c=new Create2dArray();
			System.out.println("Given array:- ");
			c.print2d(a);
			System.out.println("Main diagonal of array is ");
			int i=0;
			while(i<l){
				System.out.print(d[0][i]+" ");
				i++;
			}
			i=0;
			System.out.println("\nSecondary diagonal is: ");
			while(i<l){
				System.out.print(d[1][i]+" ");
				i++;
			}
		}
		
		return d;
	}
	public static void main(String[] args) {
		Diagonal2darr d= new Diagonal2darr();
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		d.diag2d(a, 'p');
	}
}
