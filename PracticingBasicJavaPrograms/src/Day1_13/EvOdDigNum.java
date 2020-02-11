package Day1_13;

import java.util.Scanner;

//wap to calc even and odd digits from a number
public class EvOdDigNum {
	
	public static void main(String []args) {
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int Ecount=0,Ocount=0;
		while(x!=0) {
			int y = x%10;
			if(y%2==0)
			{
				Ecount++;
				//System.out.println("Number of even are : "+Ecount);
			}
			else
			{
				Ocount++;
				//System.out.println("Number of odd are : "+Ocount);
			}
			
			x=x/10;
		}
		System.out.println("Number of even are : "+Ecount);
		System.out.println("Number of odd are : "+Ocount);
		
	}

}
