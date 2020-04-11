package polymorphism;

class A{void fun1(){System.out.println("in fun1");}}

class B extends A{void fun2(){System.out.println("in fun2");}}

public class poly1 {

	public static void main(String[] args) {A a = new A();a.fun1();
	
	B b = new B();
	b.fun2();
	b.fun1();
	A ab = new B();
	ab.fun1();
	B ba = (B) new A();
	ba.fun1();
	
	}
	
}
