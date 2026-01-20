package ObjectClass;

public class Person {
	String nm;
	int id;
	Person(int id,String nm){
		this.id=id;
		this.nm=nm;
	}
	@Override
	public String toString() {
		return ("id: "+id+" name: "+nm); 
	}
	
	public static void main(String[] args) {
		Person p=new Person(10,"xyz");
		System.out.println(p);
		p.toString();
	}
}
