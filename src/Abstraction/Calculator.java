package Abstraction;

public abstract class Calculator { //if public not written then class becomes default , if abstract method written inside class then class also has to be abstract otherwise error, abstract class can contain non-abstract i.e. concrete type methods but not vice versa
	public abstract int add(int a,int b); // abstract method unknown implementation , implementation to be given by child class
	public abstract int mul(int a,int b); // abstract method unknown implementation , implementation to be given by child class
	public int sub(int a,int b) { //concrete method
		return a-b;
	}
}
