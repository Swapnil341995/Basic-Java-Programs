package exceptionHandling;

import java.util.Scanner;

public class ESnippet7 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("enter the age : ");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			if(age < 0)
			{
				throw new ArithmeticException("Age cannot be negative");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
	}

}
