package Abstraction;

public abstract class Game {
	public abstract void start();
	public abstract void end();
	public void play() {
		start();
		System.out.println("Play game !!");
		end();
	}
}
