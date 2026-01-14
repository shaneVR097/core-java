package Encapsulation;

public class Trainer {
	private int id;
	private String nm;
	private int pw;
	
	public Trainer() {
		
	}
	
	public Trainer(int id,String nm,int pw) {
		this.id=id;
		this.nm=nm;
		this.pw=pw;
	}
	
	public int getID() {
		return id;
	}

	public String getNM() {
		return nm;
	}
	
	public int getPW() {
		return pw;
	}
	
	public void setID(int id) {
		this.id=id;
	}
	
	public void setNM(String nm) {
		this.nm=nm;
	}
	
	public void setPW(int pw) {
		this.pw=pw;
	}
}
