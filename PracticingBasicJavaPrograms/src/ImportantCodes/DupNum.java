package ImportantCodes;

import java.util.Scanner;

//How do you find the duplicate number on a given integer array?

public class DupNum {

	public static void main(String[] args) {

		System.out.println("Enter the number of array elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
		}
		
		int arr[] = new int[50];
		int k = 0;
		int i = 0;
		for(int j = 0;j < n;j++) {
			for(k = j+1;k < n;k++) {
				if(a[j] == a[k]) {
					System.out.println(a[j]);
				}
			}

		}
		
	}

}
