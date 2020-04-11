package exceptionHandling;

class A
{
	int i;

	public A(String s) throws NumberFormatException
	{
		i = Integer.parseInt(s);    //This statement throws NumberFormatException
	}
}


public class ESnippet5 {
	public static void main(String[] args)
	{
		try
		{
			A a = new A("&quot;abc&quot;");    //Object creation statement enclosed in try-catch block
		}
		catch (NumberFormatException ex)
		{
			System.out.println("&quot;NumberFormat Exception will be caught here&quot;");
		}
	}
}
