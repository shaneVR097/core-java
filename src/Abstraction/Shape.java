package Abstraction;

public abstract class Shape {
	public abstract void area();
	public void display() {
		System.out.println("Area of this shape is: ");
		area();
	}
}
