package Relationship;

public class College {
	private String name;
	private String loc;
	private Student s;
	private Trainer t;
	
	College(){
		
	}
	
	College(String name,String loc,Student s,Trainer t){
		setName(name);
		setLoc(loc);
		setS(s);
		setT(t);
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public Trainer getT() {
		return t;
	}
	public void setT(Trainer t) {
		this.t = t;
	}
	public void printCollege() {
		System.out.println("College-name: "+name+" College-location: "+loc+" Trainer-name: "+t.getName()+", Subject-name: "+t.getSubject()+" Student-id: "+s.getId()+" Student-name: "+s.getName());
	}
}
