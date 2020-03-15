package abstractSnippets;

abstract class AAA
{
	{
		methodA();
	}
	
	abstract void methodA();
}

class BBB extends AAA
{
	@Override
	void methodA()
	{
		System.out.println("methodA");
	}
}

public class ASnippet12
{
	public static void main(String[] args)
	{
		new BBB();
	}		
}

//output--------- methodA