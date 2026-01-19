package Interface;

public interface Calc {
	public abstract int add(int a,int b); // not mandatory to write public abstract in interface it assumes it by default
	int mul(int a,int b);
	int sub(int a,int b);
	public abstract void m1();
	abstract void m2();
	//protected abstract void m3(); //CTE
	//private abstract void m4(); //CTE
}
