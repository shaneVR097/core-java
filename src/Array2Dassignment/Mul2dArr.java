package Array2Dassignment;

public class Mul2dArr {
	public boolean ordercheck(int[][] a,int [][] b) {
		Add2dArr ad=new Add2dArr();
		if(!ad.notjagged(a) || !ad.notjagged(b))
			return false;
	
		if(a[0].length!=b.length)
			return false;
		
		return true;
	}
		
	public int[][] mul2d(int[][] a,int[][] b,char p){
		if(!ordercheck(a, b)) {
			System.out.println("Invalid Dimensions !!");
			return null;
		}
		int[][] m=new int[a.length][b[0].length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				m[i][j]=0;
				for(int k=0;k<a[0].length;k++) {
					m[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		if(p=='p' || p=='P') {
			Create2dArray c=new Create2dArray();
			c.print2d(m);
		}
			
		return m;
	}
	
	public static void main(String[] args) {
		Create2dArray c=new Create2dArray();
		Mul2dArr mul=new Mul2dArr();
//		int[][] a=c.create2d();
//		int[][] b=c.create2d();
//		c.print2d(a);
//		c.print2d(b);
//		mul.mul2d(a, b, 'p');
		int[][] a2= {{1,2,3},{4,5,6}}; //{{1,2},{3,4},{5,6}};
		c.print2d(a2);
		int[][] b2= {{1,2},{3,4},{5,6}}; //{{1,2,3},{4,5,6}};
		c.print2d(b2);
		mul.mul2d(a2, b2, 'p');
		c.sc.close();
	}
}
