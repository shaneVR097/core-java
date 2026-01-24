package CollectionsCncpt;

public class Student {
	int id;
	String nm;
//	public Student() {
//		
//	}
	public Student(int id,String nm) {
		this.id=id;
		this.nm=nm;
	}
	@Override
	public String toString() {
		return ("Id:"+this.id+", Name: "+this.nm);
	}
}
