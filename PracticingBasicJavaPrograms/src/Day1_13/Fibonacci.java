package Day1_13;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Fibonacci series");
		System.out.println("Enter the number of fibonacci series you want : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The required fibonacci series is : ");
		if(n==1)
		{
			System.out.println(0);
		}
		else if(n==2)
		{
			System.out.println("0"+" 1");
		}
		else if(n>2)
		{
			System.out.print("0 "+"1 ");
			int a = 0;
			int b = 1;
			for(int i = 1;i <= n-2;i++)
			{
				int c = a+b;
				
				System.out.print(c+" ");
				a = b;
				b = c;
			}
		}
		
	}

}
