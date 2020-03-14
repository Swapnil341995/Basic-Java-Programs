package interfaceSnippets;

interface X1
{
	void methodX();
	
	interface Y
	{
		void methodY();
	}
}

class Z1 implements X1, X1.Y
{
	{
		methodX();
		
		System.out.println(1);
	}
	
	public void methodX()
	{
		methodY();
		
		System.out.println(2);
	}
	
	public void methodY()
	{
		System.out.println(3);
	}
}


public class ISnippet13
{
	public static void main(String[] args)
	{
		Z1 z = new Z1();
		
		z.methodX();
		
		z.methodY();
		
		X1 x = z;
		
		x.methodX();
	}
}
