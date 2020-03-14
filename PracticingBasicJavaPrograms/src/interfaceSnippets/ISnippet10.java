package interfaceSnippets;

interface A1
{
	int methodA();
}

interface B1
{
	int methodB();
}

interface C1
{
	int methodC();
}

class D implements A1, B1, C1
{
	int i = 999+111;
	
	public int methodA()
	{
		i =+ i / i;
		
		return i;
	}
	
	public int methodB()
	{
		i =- i * i;
		
		return i;
	}
	
	public int methodC()
	{
		i = ++i - --i;
		
		return i;
	}
}

public class ISnippet10
{
	public static void main(String[] args)
	{
		D d = new D();
		System.out.println(d.i);
		System.out.println(d.methodA());
		System.out.println(d.methodB());
		System.out.println(d.methodC());
	}
}


