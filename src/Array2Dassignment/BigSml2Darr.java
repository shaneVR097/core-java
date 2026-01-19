package Array2Dassignment;
public class BigSml2Darr {
	public int[] bigsml(int[][] a,char p) {
		int mx=a[0][0],mn=a[0][0];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++) {
				mn = (mn>a[i][j]) ? a[i][j]:mn; 
				mx = (mx<a[i][j]) ? a[i][j]:mx;
			}
		if(p=='p' || p=='P')
			System.out.println("Biggest element is: "+mx+"\nSmallest element is: "+mn);
		return new int[] {mx,mn};
	}
	
	public static void main(String[] args) {
		Create2dArray c = new Create2dArray();
		int[][] a=c.create2d(2,2);
		c.print2d(a);
		
		BigSml2Darr bs=new BigSml2Darr();
		bs.bigsml(a,'p');
		c.sc.close(); //c.closescanner(); spcl mthd cretaed to close scanner
	}
}
