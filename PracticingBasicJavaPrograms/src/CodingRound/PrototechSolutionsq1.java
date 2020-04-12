package CodingRound;

import java.util.Scanner;

public class PrototechSolutionsq1 {

	//wap to find the determinant of 3 X 3 matrix
	
	public static void main(String[] args) {

		int arr[][] = new int[3][3];
		int d1 = 0,d2 = 0, d3 = 0;
		int Determinant = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i < 3;i++) {
			
			for(int j = 0;j < 3;j++) {
				
				arr[i][j] = sc.nextInt();
				
			}
			
		}
		
		d1 = arr[0][0] * ((arr[1][1] * arr[2][2])-(arr[2][1] * arr[1][2]));
		
		d2 = arr[0][1] * ((arr[1][0] * arr[2][2])-(arr[2][0] * arr[1][2]));

		d3 = arr[0][2] * ((arr[1][0] * arr[2][1])-(arr[2][0] * arr[1][1]));

		Determinant = d1 - d2 + d3;
		
		System.out.println(Determinant);
		
		sc.close();
		
	}

}
