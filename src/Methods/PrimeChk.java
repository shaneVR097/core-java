package Methods;

public class PrimeChk {
	public static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main (String[] args) {
		if(isPrime(20)) {
			System.out.println("Prime number");
		} else {
			System.out.println("Composite number");
		}
	}
}
