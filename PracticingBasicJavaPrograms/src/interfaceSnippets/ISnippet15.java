package interfaceSnippets;

abstract class Az
{
	abstract void myMethod(Number N);
}

interface Bz
{
	abstract void myMethod(Object O);
}

class Cz extends Az implements Bz
{
	void myMethod(Number N) 
	{
		System.out.println("Number");
	}
	
	public void myMethod(Object O)
	{
		System.out.println("Object");
	}
}

public class ISnippet15
{
	public static void main(String[] args)
	{
		Az a = new Cz();
		
		a.myMethod(new Integer(121));
		
		Bz b = new Cz();
		
		b.myMethod(new Integer(121));
		
		Cz c = new Cz();
		
		c.myMethod(new Integer(121));
	}
}
