package patternPrograms;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i < n;i++) {
			for(int j = n-1;j > i;j-- ) {
				System.out.print(" ");
			}
			for(int k = 0;k <= i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
