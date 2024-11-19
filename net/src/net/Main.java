package net;

class A {

	void meth() {
		System.out.println("meth");
		System.out.println("meth1");
	}
}
public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.meth();
	}
}
