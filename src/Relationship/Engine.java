package Relationship;

public class Engine {
	private int cc;
	private String type;
	
	Engine(){
		
	}
	Engine(int cc,String type){
		setcc(cc);
		settype(type);
	}
	
	public int getcc() {
		return cc;
	}
	
	public void setcc(int cc) {
		this.cc = cc;
	}
	
	public String gettype() {
		return type;
	}
	
	public void settype(String type) {
		this.type = type;
	}
	public void printEngine() {
		System.out.println("Engine-displacement: "+getcc()+", Fuel-type: "+gettype());
	}
}
