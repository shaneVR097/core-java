package AccessModifier;

public class Driver {
	public static void main(String[] args) {
		DBConnection db1=DBConnection.getDBConnection();
		DBConnection db2=DBConnection.getDBConnection();
		System.out.println(db1==db2);
		Dbc2 a=Dbc2.getDbc2();
		Dbc2 b=Dbc2.getDbc2();
		Dbc2 c=Dbc2.getDbc2();
		Dbc2 d=Dbc2.getDbc2();
		Dbc2 e=Dbc2.getDbc2();
		Dbc2 f=Dbc2.getDbc2();
		System.out.println("a: "+a+"\nb: "+b+"\nc: "+c+"\nd: "+d+"\ne: "+e+"\nf: "+f);
	}
}
