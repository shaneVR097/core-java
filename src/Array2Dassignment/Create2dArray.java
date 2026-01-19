package Array2Dassignment;

import java.util.Scanner;

public class Create2dArray {
	Scanner sc=new Scanner(System.in);
	public int[][] create2d(){
		System.out.println("Enter no. of rows and columns: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++) {
			System.out.println("Enter element for row-"+(i+1));
			for(int j=0;j<c;j++) {
				System.out.print("col-"+(j+1)+": ");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("New Array created of "+r+" rows "+c+" columns");
		return a;
	}
	
	public int[][] create2d(int r,int c){
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++) {
			System.out.println("Enter element for row-"+(i+1));
			for(int j=0;j<c;j++) {
				System.out.print("col-"+(j+1)+": ");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("New Array created of "+r+" rows "+c+" columns");
		return a;
	}
	
	public void print2d(int a[][]) {
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length-1;j++) {
				System.out.print(a[i][j]+", ");
			}
			System.out.println(a[i][a[i].length-1]);
		}
	}
	
	public void closescanner() {
		sc.close();
	}
}
