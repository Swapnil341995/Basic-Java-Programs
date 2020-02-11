package Day1_13;

import java.util.Scanner;

public class BinToDec {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the binary : ");
		Scanner sc = new Scanner(System.in);
		int bin = sc.nextInt();
		int sum=0,i=0;
		while(bin>0)
		{
			int rem = bin%10;
			sum =(int) (sum + rem*Math.pow(2, i));
			bin=bin/10;
			i++;
		}
		System.out.println(sum);
		
		
	}

}
