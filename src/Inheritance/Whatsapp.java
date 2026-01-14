package Inheritance;

class App{
	String use;
	boolean pay;
}

public class Whatsapp extends App{
	String cust_type;
	long phno;
	Whatsapp(String use,boolean pay,String cust_type,long phno){
		this.use=use;
		this.pay=pay;
		this.cust_type=cust_type;
		this.phno=phno;
	}
	
	public void printWapp() {
		System.out.println(use+" "+((pay)?" Paid ":" Free ")+" "+cust_type+" Customer phone no.: "+phno);
	}
	
	public static void main(String[] args) {
		Whatsapp w = new Whatsapp("Chatting",false,"Business",912395415);
		w.printWapp();
	}
	
}
