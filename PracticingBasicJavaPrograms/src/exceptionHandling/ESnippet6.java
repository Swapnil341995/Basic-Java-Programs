 	package exceptionHandling;

public class ESnippet6 {
	//method throwing Unchecked Exception declared without throws clause

		static void methodThrowingUncheckedException()
		{
			int i = Integer.parseInt("&quot;abc&quot;");   

			//Above statement throws NumberFormatException which is unchecked type of exception
		}

		//method throwing checked Exception declared with throws clause

		static void methodThrowingCheckedException() throws ClassNotFoundException
		{
			//try {
				Class.forName("&quot;AnyClassName&quot;");
			//} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}

			//Above statement throws ClassNotFoundException which is checked type of exception
		}

		public static void main(String[] args)
		{
			try
			{
				methodThrowingUncheckedException();
			}
			catch(NumberFormatException ex)
			{
				System.out.println("&quot;NumberFormatException will be caught here&quot;");
			}

			try
			{
				methodThrowingCheckedException();
			}
			catch (ClassNotFoundException e)
			{
				System.out.println("&quot;ClassNotFoundException will be caught here&quot;");
			}
		}
}
