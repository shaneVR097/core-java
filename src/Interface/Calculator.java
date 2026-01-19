package Interface;

public abstract class Calculator implements Calc {
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public abstract int sub(int a,int b);
}
