package Interface;

public interface House {
	void location();
	void type();
}

class Flat implements House {
	@Override
	public void location() {
		System.out.println("\nFlat at Dumdum, Kolkata");
	}
	public void type() {
		System.out.println("\nWork purpose");
	}
}

class AncestralHouse implements House {
	@Override
	public void location() {
		System.out.println("\nAncestral home at Hooghly,W.B.");
	}
	public void type() {
		System.out.println("\nNative home");
	}
}