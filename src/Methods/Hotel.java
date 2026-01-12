package Methods;

public class Hotel {
	public static void main(String[] args) {
		System.out.println("Main start");
		cheif();
		server();
		cashier();
		System.out.println("Main End");
	}
	public static void server() {
		System.out.println("Serving Food");
	}
	public static void cheif() {
		System.out.println("Prepearing Food");
	}
	public static void cashier() {
		System.out.println("Counting Money");
	}
}