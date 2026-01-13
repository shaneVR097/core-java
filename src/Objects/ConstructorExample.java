package Objects;

public class ConstructorExample {
	int id;
	String nm;
	
	public ConstructorExample() { //no-argument constructor
		System.out.println("constructor");
	}
	
	public ConstructorExample(int id, String nm) { //parameterized constructor
		this.id=id; this.nm=nm;
	}
	
	public void display() { //non static method
		System.out.println(id);
		System.out.println(nm);
	}
	public static void main(String[] args) {
		ConstructorExample c=new ConstructorExample();
		c.display();
		ConstructorExample c2=new ConstructorExample(2,"max");
		c2.display();
	}
}
