package Day1_13;

import java.util.Scanner;

//program to convert a number to binary
public class NumToBin {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number to convert : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int bin[] = new int[100];
		int i=0;
		while(num>0)
		{
			bin[i] = num%2;
			num=num/2;
			i++;
			
		}
		for(int j = i-1;j>=0;j--)
		{
			System.out.println(bin[j]);
		}
		
	}

}
