package CodingRound;

import java.util.Scanner;

public class PrototechSolutionsq2 {

	//wap to find the sum of ascii value of inputed string
	
	public static void main(String[] args) {

		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sum = 0;
		
		for(int i = 0;i < s.length();i++) {
			
			sum += (int)s.charAt(i);
			
		}
		
		System.out.println(sum);
		
	}

}
