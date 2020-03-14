package interfaceSnippets;

interface Xx
{
	void method();
	default void show()
	{
		System.out.println("Interface can have default methods");
	}
	static void fun()
	{
		System.out.println("Interface can have static methods");
	}
}

class Yy
{
	public void method()
	{
		System.out.println("CLASS Y");
	}
}

class Z extends Yy implements Xx
{
	
}

public class ISnippet9
{
	public static void main(String[] args)
	{
		Xx x = new Z();
		x.method();
	}
}

// output ------- CLASS Y
