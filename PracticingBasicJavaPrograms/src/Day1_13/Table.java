package Day1_13;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		int i,j;
		System.out.println("Enter the number you want to see the table of : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i=1;i<=10;i++)
		{
			
			System.out.println(n + "*" +i+ "=" +(n*i) );
			
		}
		
	}

}
