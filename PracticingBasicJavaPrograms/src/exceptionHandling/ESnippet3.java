package exceptionHandling;

public class ESnippet3 {

	static void methodWithThrows() throws NumberFormatException, NullPointerException
	{
		int i = Integer.parseInt("quot;abc&quot;");   //This statement throws NumberFormatException

		String s = null;

		System.out.println(s.length());    //This statement throws NullPointerException
	}

	public static void main(String[] args)
	{
		try
		{
			methodWithThrows();
		}
		catch(Exception ex)
		{
			System.out.println("&quot;This block can handle all types of exceptions&quot;");
		}
	}

}
