package abstractSnippets;

abstract class X1
{
	int i = 111;
	
	int methodX()
	{
		return methodX(i);
	}
	
	abstract int methodX(int i);
}

class Y1 extends X1
{
	@Override
	int methodX(int i)
	{
		return ++i + i++;
	}
}

public class ASnippet9
{
	public static void main(String[] args)
	{
		Y1 y = new Y1();
		
		System.out.println(y.methodX());
	}		
}

//output---------	224
