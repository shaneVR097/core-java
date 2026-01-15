package Inheritance;

class WappV3 extends WappV2{
	public void metaAI(String query) {
		System.out.println("Query: "+query);
	}
	public static void main(String[] args) {
		WappV3 w3=new WappV3();
		w3.Chat("Hello Again");
		w3.Status("Posting new status !! ");
		w3.metaAI("First Query");
	}
}
