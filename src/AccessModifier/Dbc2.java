package AccessModifier;

public class Dbc2 {
	private static Dbc2 conn;
	private static int c=1;
	private Dbc2() { //to restrict multiple object creation of class outside
		System.out.println("private constructor !!");
	}
	
	public static Dbc2 getDbc2() {
		if(Dbc2.c<=5) {
			conn=new Dbc2();
			Dbc2.c++;
		} else {
			System.out.println("\nMaximum number of connections exhausted !!");
			conn=null;
		}
		return conn;
	}
}

