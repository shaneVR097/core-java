package Interface;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1= new Person();
		Person p2= new Person();
		Person p3= new Person();
		p1.setV(new Car()); p1.setH(new Flat()); p1.setJ(new PrimaryJob());
		p2.setV(new Bike()); p2.setH(new AncestralHouse()); p2.setJ(new Freelancer());
		p3.setV(new Cycle()); p3.setH(new Flat()); p3.setJ(new PrimaryJob());
		Vehicle v1=p1.getV();
		v1.type();
		v1.price();
		Vehicle v2=p2.getV();
		v2.type();
		v2.price();
		Vehicle v3=p3.getV();
		v3.type();
		v3.price();
		
		House h1=p1.getH();
		h1.location();
		h1.type();
		House h2=p2.getH();
		h2.location();
		h2.type();
		House h3=p3.getH();
		h3.location();
		h3.type();
		
		Job j1=p1.getJ();
		j1.servicetype();
		j1.role();
		
		Job j2=p2.getJ();
		j2.servicetype();
		j2.role();
		
		Job j3=p3.getJ();
		j3.servicetype();
		j3.role();

		MobilePhone phn1 =new MobilePhone();
		phn1.setMp3(new Spotify());
		
		MobilePhone phn2 =new MobilePhone();
		phn2.setMp3(new YoutubeMusic());
		
		MusicPlayer mp1= phn1.getMp3();
		mp1.play();
		mp1.pause();
		mp1.stop();
		
		MusicPlayer mp2= phn2.getMp3();
		mp2.play();
		mp2.pause();
		mp2.stop();
		
		Vehicle v=HelpVehicle.getVehicle();
		v.type();
		v.price();//System.out.println(v);
	}
}
