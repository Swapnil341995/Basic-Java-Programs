package exceptionHandling;

public class ESnippet1 {

	public static void main(String[] args) {

		try 
		{
			System.out.println("in try");
			int a = 5/0;
			System.out.println("1");
		}
		catch(Exception e)
		{
			System.out.println("in catch");
		}
		finally
		{
			System.out.println("in finally");
		}
		System.out.println("out of try-catch-finally");
		
	}

}
