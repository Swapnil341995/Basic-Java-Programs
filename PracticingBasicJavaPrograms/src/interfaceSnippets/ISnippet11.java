package interfaceSnippets;

interface Aa
{
	String A = "AAA";
	
	String methodA();
}

interface Bb
{
	String B = "BBB";
	
	String methodB();
}

class C implements Aa, Bb
{
	public String methodA()
	{
		return A+B;
	}
	
	public String methodB()
	{
		return B+A;
	}
}

class Dd extends C implements Aa, Bb
{
	String D = "DDD";
	
	public String methodA()
	{
		return D+methodB();
	}
}

public class ISnippet11
{
	public static void main(String[] args)
	{
		C c = new C();
		System.out.println(c.methodA());
		System.out.println(c.methodB());
		c = new Dd();
		System.out.println(c.methodA());
		System.out.println(c.methodB());
	}
}
