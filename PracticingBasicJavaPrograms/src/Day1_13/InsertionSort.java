package Day1_13;

import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String []args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to sort : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			System.out.println("Enter the "+(i+1)+" element : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1;i < n;i++)
		{
			int key;
			key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		}
		
		for(int i = 0;i < n;i++)
		{
			System.out.println("Sorted elements : "+arr[i]);
		}
	}

}
