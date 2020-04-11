package patternPrograms;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i = 0;i < row;i++) {
			for(int j = row;j > i+1;j--) {
				System.out.print(" ");
			}
			for(int k = 0;k < 2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
