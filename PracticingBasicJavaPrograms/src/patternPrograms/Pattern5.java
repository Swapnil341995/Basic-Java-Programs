package patternPrograms;

import java.util.Scanner;

public class Pattern5 {
	static int k = 1;
	public static void main(String []args) {
		System.out.println("Ente the no. of rows : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i = 0;i <= row;i++) {
			for(int j = 0;j < i;j++) {
				
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
	}

}
