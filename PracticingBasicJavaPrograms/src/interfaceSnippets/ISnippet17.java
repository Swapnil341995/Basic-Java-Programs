package interfaceSnippets;

class A11 { }

class B11 extends A11 { }

class C11 extends B11 { }

interface ABC11
{
	void method(A11 a);
}

interface PQR
{
	void method(B11 b);
}

class M implements ABC11, PQR
{	
	public void method(A11 a)
	{
		System.out.println(2);
	}
	
	public void method(B11 b) 
	{
		System.out.println(3);
	}
}

public class ISnippet17
{
	public static void main(String[] args)
	{
		M m = new M();
		
		m.method(new A11());
		
		m.method(new B11());
		
		m.method(new C11());
	}
}
