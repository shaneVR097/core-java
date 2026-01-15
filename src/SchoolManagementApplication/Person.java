package SchoolManagementApplication;

public class Person {
	private String name;
	private int age;
	
	Person(){
		
	}
	Person(String name, int age){
		setName(name);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printPerson() {
		System.out.println("Person-name: "+name+" Age: "+age);
	}
}
