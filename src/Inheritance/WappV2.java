package Inheritance;

class WappV2 extends WappV1 {
	public void Status(String sts) {
		System.out.println("Status: "+sts);
	}
	
	public static void main(String[] args) {
		WappV2 w2 = new WappV2();
		w2.Chat(" Hi! I am Shyantan");
		w2.Status(" Hello!! Everyone ");
	}
}
