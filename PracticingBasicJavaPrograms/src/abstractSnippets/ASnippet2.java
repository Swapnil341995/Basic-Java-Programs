package abstractSnippets;

abstract class X
{
	public X()
	{
		System.out.println("ONE");
	}
	void methodX()
	{
		System.out.println("methodX");
	}
	
	abstract void abstractMethod();
}

class Y extends X
{
	public Y() 
	{
		System.out.println("TWO");
	}
	
	@Override
	void abstractMethod()
	{
		System.out.println("THREE");
	}
}

public class ASnippet2
{
	public static void main(String[] args)
	{
		X x = new Y();
		x.methodX();
		x.abstractMethod();
	}
}
