package Array2Dassignment;
public class Add2dArr {
	public boolean notjagged(int[][] a) {
		if(a==null || a.length<0) {
			System.out.println("Array length is null or 0 !!");
			return false;
		}
		int la=a.length,laa=a[0].length;
		for(int i=0;i<la;i++) {
			if(laa!=a[i].length) {
				System.out.println("Jagged array detected !!");
				return false;
			}
		}
		return true;
	}
	
	public boolean sameorder(int[][] a,int[][] b) {
		if(!notjagged(a) || !notjagged(b))
			return false;
		if(notjagged(a) && notjagged(b)) {
			int la=a.length,lb=b.length;
			if(la!=lb) {
				System.out.println("Inequal number of rows in arrays !!");
				return false;
			}
			else
				for(int i=0;i<la;i++)
					if(a[i].length!=b[i].length){
						System.out.println("Inequal number of columns in arrays !!");
						return false;
					}
		} else
			return false;
		
		return true;
	}
	
	public int[][] add2d(int[][] a,int[][] b,char p) {
		if(!sameorder(a,b))
			return null;
		int lr=a.length,lc=a[0].length;
		int i,j;
		int[][] c=new int[lr][lc];
		for(i=0;i<lr;i++)
			for(j=0;j<lc;j++)
				c[i][j]=a[i][j]+b[i][j];
		if(p=='p'|| p=='P') {
			Create2dArray c2=new Create2dArray();
			c2.print2d(c);
		}
		return c;		
	}
	
	public static void main(String[] args) {
		Create2dArray c=new Create2dArray();
		Add2dArr add=new Add2dArr();
//		add.add2d(null, null, 'p');
//		int[][] a=c.create2d();
//		int[][] b=c.create2d();
//		c.print2d(a);
//		c.print2d(b);
//		add.add2d(a, b, 'p');
		int[][] a2= {{1,2,3},{4,5,6}};
		c.print2d(a2);
		int[][] b2= {{6,5,4},{3,2,1}};
		c.print2d(b2);
		add.add2d(a2, b2, 'p');
		c.sc.close();
	}
}
