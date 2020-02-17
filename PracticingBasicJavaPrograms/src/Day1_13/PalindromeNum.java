package Day1_13;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {

		System.out.println("number is a palindrome or not");
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n;
		int r = 0;
		while(n!=0) {
			int a = n % 10;
			r = r * 10 + a;
			n = n / 10;
		}

		if(k==r) {
			System.out.println("Number is palindrome ");
		}
		else {
			System.out.println("number is not a palindrome");
		}
		
	}

}
