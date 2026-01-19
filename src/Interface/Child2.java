package Interface;

public class Child2 extends Child1 implements Int1,Int2 {
	@Override
	public int m1() {
		return 0;
	}
	public static void main(String[] args) {
		Int1 i1=new Child2();
		Child1 c1=new Child2();
		Int2 i2=new Child2();
		i1.m1();
		i2.m1();
	}
}
class Child1{
	
}
interface Int1 extends Int2,Int3{ //multiple inheritance for interface because it has only concrete methods so whoever declares will implement it as well
	//	void m1(); // nt possible because m1 is overridden from int2 whose r/t is different 
	int m1();
}
interface Int2{
	int m1();
}
interface Int3{
	
}