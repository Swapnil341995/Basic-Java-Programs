package Day1_13;

import java.util.Scanner;

//wap to count no. of digits in an integer
public class numbOfDigInInt {
	
	public static void main(String []args) {
		
		System.out.println("enter the integer : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(String.valueOf(x).length());
		System.out.println(CountNumber(x));
//		System.out.println("Enter the character : ");
//		char ch =sc.next().charAt(0);
//		System.out.println(ch);

//		int i,count=0;
//		while(x>0) {
//			
//			x = x/10;
//			count++;
//			
//		}
		//System.out.println("the number of digits it has is : "+count);
	}
	
	public static int CountNumber(int n) {
		if(n==0)
			return 0;
		else
			return 1+CountNumber(n/10);
	}

}
