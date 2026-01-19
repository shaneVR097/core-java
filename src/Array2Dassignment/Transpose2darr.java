package Array2Dassignment;

public class Transpose2darr {
	public int[][] transpose2d(int[][] a,char p){
		Add2dArr ad=new Add2dArr();
		if(!ad.notjagged(a)) {
			System.out.println("Cannot perform transpose on jagged array !!");
			return null;
		}
		int lr=a.length,lc=a[0].length;
		int[][] t=new int[lc][lr];
		for(int i=0;i<lr;i++)
			for(int j=0;j<lc;j++) 
					t[j][i]=a[i][j];
		
		if(p=='p' || p=='P') {
			Create2dArray c=new Create2dArray();
			System.out.println("Original array:- ");
			c.print2d(a);
			System.out.println("Transposed array:- ");
			c.print2d(t);
		}
		
		return t;
	}
	public static void main(String[] args) {

		Transpose2darr t=new Transpose2darr();
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		t.transpose2d(a, 'p');

		int[][] b= {{1,2},{3,4},{5,6}};
		t.transpose2d(b, 'p');
		
		int[][] d= {{1,2,3,4},{5,6,7,8}};
		t.transpose2d(d, 'p');
	}
}