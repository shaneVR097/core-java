package Array2D;
import java.util.Scanner;
public class IntArr2D {
	
	public static int[] rowsum(int[][] a) {
		int[] rs=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int s=0;
			for(int j=0;j<a[i].length;j++) {
				s+=a[i][j];
			}
			rs[i]=s;
		}
		return rs;
	}
	
	public static int[][] colsum(int[][] a) {
		int[][] cs = new int[1][a[0].length];

		for (int j = 0; j < a[0].length; j++) {
			int s = 0;
			for (int i = 0; i < a.length; i++) {
				s += a[i][j];
			}
			cs[0][j] = s;
		}

		return cs;
	}
	
	public static void main(String[] args) {
		int[][] a=new int[2][3];
		int k=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=k++;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length-1;j++) {
				System.out.print(a[i][j]+", ");
			}
			System.out.print(a[i][a[i].length-1]);
			System.out.println();
		}
		Scanner sc=new Scanner(System.in);
		int[][] b=new int[2][3];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println("Enter element at row-"+(i+1)+" column-"+(j+1)+" : ");
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length-1;j++) {
				System.out.print(b[i][j]+", ");
			}
			System.out.print(b[i][b[i].length-1]);
			System.out.println();
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				if(b[i][j]%2==0)
					System.out.println("Index of "+b[i][j]+" is: row-"+(i+1)+", col-"+(j+1));
			}
			System.out.println();
		}
		
		int[] rs=rowsum(b);
		for(int i=0;i<rs.length;i++)
			System.out.println("Sum of elements in "+(i+1)+" row is= "+rs[i]);
		int[][] cs=colsum(b);
		for(int i=0;i<cs[0].length;i++)
			System.out.println("Sum of elements in "+(i+1)+" column is= "+cs[0][i]);
		sc.close();
	}
}
