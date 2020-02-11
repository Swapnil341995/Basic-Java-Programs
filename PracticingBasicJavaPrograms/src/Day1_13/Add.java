package Day1_13;

import java.util.Scanner;
//program to find the sum of 2 numbers
public class Add {
	
	public static void main(String[] args) 
	{
		System.out.println("Adding 2 numbers : ");
		int num1,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number to Add :");
		num1=sc.nextInt();
		
		System.out.println("Enter the Second Number to Add :");
		num2=sc.nextInt();
		
		sum=num1+num2;
		System.out.println("the addition of two numbers is : "+sum);
		
	}

}
