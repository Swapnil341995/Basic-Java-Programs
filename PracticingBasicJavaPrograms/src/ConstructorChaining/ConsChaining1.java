
package ConstructorChaining;

class A {

	A(int a, int b) {

		System.out.println("in A");

	}

}

class B extends A {

	B(int a) {
		super(a, 10);
		System.out.println("in B");

	}

}

public class ConsChaining1 extends B {

	public ConsChaining1(int a) {

		super(a);
		System.out.println("in conschaining");

	}

	public static void main(String[] args) {
		ConsChaining1 cc = new ConsChaining1(10);
		System.out.println("in main ");
	}

}
