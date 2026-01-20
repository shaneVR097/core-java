package AccessModifier;

public class DBConnection {
	private static DBConnection conn;
	
	private DBConnection() { //to restrict multiple object creation of class outside
		System.out.println("private constructor !!");
	}
	
	public static DBConnection getDBConnection() {
		if(conn==null)
			conn=new DBConnection();
		return conn;
	}
}
