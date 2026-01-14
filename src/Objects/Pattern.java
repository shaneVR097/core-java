package Objects;

public class Pattern {
	public void P1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
	}
	
	public void P2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=i+1;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void P3(int n) {
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void P4(int n) {
		for(int i=n;i>0;i--) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void Diamond(int n) {
	    // Upper half
	    for(int i = 0; i < n; i++) {
	        for(int s = n - i - 1; s > 0; s--) {
	            System.out.print(" ");
	        }
	        for(int st = 0; st < (2 * i + 1); st++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	    // Lower half
	    for(int i = n - 2; i >= 0; i--) {
	        for(int s = n - i - 1; s > 0; s--) {
	            System.out.print(" ");
	        }
	        for(int st = 0; st < (2 * i + 1); st++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}

	public void Hourglass(int n) {
	    for(int i = n - 1; i >= 0; i--) {
	        for(int s = 0; s < n - i - 1; s++) {
	            System.out.print(" ");
	        }
	        for(int st = 0; st < (2 * i + 1); st++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	    for(int i = 1; i < n; i++) {
	        for(int s = n - i - 1; s > 0; s--) {
	            System.out.print(" ");
	        }
	        for(int st = 0; st < (2 * i + 1); st++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}


	public static void main(String[] args) {
		Pattern p1=new Pattern();
		p1.P1(4);
		System.out.println();
		p1.P2(4);
		System.out.println();
		p1.P3(4);
		System.out.println();
		p1.P4(4);
		System.out.println();
		p1.Diamond(4);
		System.out.println();
		p1.Hourglass(4);
	}
}
