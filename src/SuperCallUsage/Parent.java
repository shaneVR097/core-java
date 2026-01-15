package SuperCallUsage;

class Parent {
	String nm;
	int a=10;
	Parent(){
		
	}
	public Parent(String nm) {
		this();
		this.nm=nm;
	}
	public void m1(){
		System.out.println("Parent-class m1 "+a);
	}
}
