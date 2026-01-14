package Encapsulation;

public class Account {
	private int id;
	private int blc;
	private int pw;
	
	public Account() {
		
	}
	
	public Account(int id,int blc,int pw) {
		this.id=id;
		setBLC(blc);
		this.pw=pw;
	}
	
	public int getID() {
		return id;
	}

	public int getBLC(int pw) {
		if(this.pw==pw)
			return blc;
		else {
			System.out.println("Password not matching !!");
			return 0;
		}
			
	}
	
	public int getPW() {
		return pw;
	}
	
	public void setID(int id) {
		this.id=id;
	}
	
	public void setBLC(int blc) {
		if(blc>0)
			this.blc=blc;
		else
			System.out.println("Balance cant be negative");
	}
	
	public void setPW(int pw) {
		this.pw=pw;
	}
}
