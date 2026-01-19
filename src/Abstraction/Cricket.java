package Abstraction;

public class Cricket extends Game{
	@Override
	public void start() {
		System.out.println("Start ater toss of cricket !!");
	}
	public void end() {
		System.out.println("Game over after achieving target runs!!");
	}
}
