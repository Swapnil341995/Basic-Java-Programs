package exceptionHandling;

public class ESnippet4
{
	static void methodOne() throws NumberFormatException
	{
		int i = Integer.parseInt("&quot;abc&quot;");   //This statement throws NumberFormatException
	}

	static void methodTwo() throws NumberFormatException
	{
		methodOne();     //NumberFormatException is propagated here
	}

	static void methodThree() throws NumberFormatException
	{
		methodTwo();    //NumberFormatException is propagated here
	}

	public static void main(String[] args)
	{
		try
		{
			methodThree();
		}
		catch(NumberFormatException ex)
		{
			System.out.println("&quot;NumberFormat Exception will be caught here&quot;");
		}
	}
}
