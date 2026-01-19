package Abstraction;

public class BankDriver {
	public static void main(String[] args) {
		Bank bs=new SBI();
		Bank bh=new HDFC();
		bs.getinterestrate();
		bh.getinterestrate();
	}
}
