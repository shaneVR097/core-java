package SuperCallUsage;

class Human {
	String nm;
	int age;
	char gender;
	Human(String nm,int age,char gender){
		this.nm=nm;
		this.age=age;
		this.gender=gender;
	}
	public void printHuman() {
		System.out.println("Human details: "+nm+" "+age+" "+gender);
	}
}
