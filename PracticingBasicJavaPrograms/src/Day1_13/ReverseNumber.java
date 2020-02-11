package Day1_13;

import java.util.Scanner;

public class ReverseNumber {
	// wap to reverse a given number
	public static void main(String[] args) {

		System.out.println("Enter the number you want to reverse : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r = 0;
		while (num >= 1) {

			int a = num % 10;
			r = r * 10 + a;
			num = num / 10;

		}
		System.out.println("The reverse of the given number is : " + r);

	}

}
