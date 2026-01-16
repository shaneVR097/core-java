package Polymorphism;

class MapV1{
	public void direction() {
		System.out.println("Showing directions only !!");
	}
}

class MapV2 extends MapV1{
	@Override
	public void direction() {
		System.out.println("Showing both directions & time !!");
	}
}

public class MapV3 extends MapV2{
	public void bookcab() {
		System.out.println("Booking  Uber !!");
	}
	
	public static void main(String[] args) {
		MapV1 m1=new MapV1();
		m1.direction();
		//m1.bookcab();
		MapV2 m2=new MapV2();
		m2.direction();
		//m2.bookcab();
		m1=m2; //UC
		m1.direction();
		MapV3 m3=new MapV3();
		m3.direction();
		m3.bookcab();
		m1=m3; //UC
		m1.direction();
		MapV3 m4=(MapV3)m1; //DC
		m4.direction();
		m4.bookcab();
		
		
	}
}
