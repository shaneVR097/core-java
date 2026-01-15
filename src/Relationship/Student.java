package Relationship;

public class Student {
	private int id;
	private String name;
	Student(){
		
	}
	Student(int id,String name){
		setId(id);
		setName(name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printStudent() {
		System.out.println("Student-id: "+id+", Student-name: "+name);
	}
	
}
