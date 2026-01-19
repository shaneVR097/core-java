package Abstraction;

public class GameDriver{
	public static void main(String[] args) {
		Game gc=new Cricket();
		Game gf=new Football();
		gc.play();
		gf.play();
	}
}
