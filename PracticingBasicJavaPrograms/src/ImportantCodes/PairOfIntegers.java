package ImportantCodes;

import java.util.Scanner;

//How do you find all pairs of an integer array whose sum is equal to a given number?

public class PairOfIntegers {

	public static void main(String[] args) {

		System.out.println("Enter the number of elements : ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the number you want to check : ");
		int checkNum = sc.nextInt();
	
		System.out.println("Enter the elements : ");
		for(int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				if(i != j) {
					sum += a[i] + a[j];
					if(sum == checkNum) {
						System.out.println(a[i]+" and "+a[j]+" at index "+i);
					}
					sum = 0;
				}
			}
		}
		
		sc.close();
		
	}

}
