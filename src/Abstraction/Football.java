package Abstraction;

public class Football extends Game{
	@Override
	public void start() {
		System.out.println("Start after toss of football !!");
	}
	public void end() {
		System.out.println("Game over after achieving target goals !!");
	}
}

