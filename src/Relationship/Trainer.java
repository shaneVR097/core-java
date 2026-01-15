package Relationship;

public class Trainer {
	private String name;
	private String subject;
	private Student s;
	
	Trainer(){
		
	}
	
	Trainer(String name,String subject,Student s){
		setName(name);
		setSubject(subject);
		setS(s);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Student getS() {
		return s;
	}
	
	public void setS(Student s) {
		this.s = s;
	}
	
	public void printTrainer() {
		System.out.println("Trainer-name: "+name+", Subject-name: "+subject+" Student-id: "+s.getId()+" Student-name: "+s.getName());
	}
	
}
