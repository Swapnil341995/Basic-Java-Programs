package exceptionHandling;

public class ESnippet2 {

	public static void main(String[] args)
	{
		try
		{
			methodWithThrows();
		}
		catch(NullPointerException ex)
		{
			System.out.println("&quot;NullPointer Exception thrown by methodWithThrows() method will be caught here&quot;");
		}
	}

	static void methodWithThrows() throws NullPointerException
	{
		String s = null;
		System.out.println(s.length());   //This statement throws NullPointerException
	}

}
