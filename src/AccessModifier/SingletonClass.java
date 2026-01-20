package AccessModifier;

public class SingletonClass {
	private static SingletonClass sc;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getobj() {
		if(sc==null)
			sc=new SingletonClass();
		return sc;
	}
	public static void main(String[] args) {
		SingletonClass sc1= SingletonClass.getobj();
		SingletonClass sc2=SingletonClass.getobj();
		System.out.println(sc1==sc2);	
	}
}
