package Interface;

public class Person {
	private Vehicle v;
	private House h;
	private Job j;
	public Job getJ() {
		return j;
	}
	public void setJ(Job j) {
		this.j = j;
	}
	public House getH() {
		return h;
	}
	public void setH(House h) {
		this.h = h;
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v=v;
	}
}
