package Day1_13;

import java.util.Scanner;

public class PatternWithoutLoop {

	// input n = 16, o/p = 16, 11, 6, 1, -4, 1, 6, 11, 16
	// input n=10 o/p = 10, 5, 0, 5, 10

	
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter the input : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);

	}

	public static void pattern(int n) {
		int r = 0;
		r = n;
		if (r <= 16) {
			System.out.println(r + " ,");
			r = r - 5;

		}
		pattern(r);

	}

}
