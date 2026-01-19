package Abstraction;

public class Redmi3 extends Redmi2{
	@Override
	public void smartcamera() {
		System.out.println("Redmi3 adds smartness to camera !!");
	}
	public static void main(String[] args) {
		Redmi3 r=new Redmi3();
		r.battery();
		r.camera();
		r.smartcamera();
		Redmi2 r2=new Redmi3();
		r2.battery();
		r2.camera();
		r2.smartcamera();
		Redmi1 r3=new Redmi3();
		r3.battery();
		r3.camera();
		//r3.smartcamera(); //cant access cuz redmi1 dsnt know smthng like smartcamera exists as its a new method intro-ed in child class 
		Mobile r4=new Redmi3();
		r4.battery();
		r4.camera();
		//r4.smartcamera(); //cant access cuz mobile dsnt know smthng like smartcamera exists as its a new method intro-ed in child class
	}
}
