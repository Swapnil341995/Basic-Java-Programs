package Day1_13;

import java.lang.reflect.Array;
import java.util.Scanner;

public class IndSortedArr {

	// given a sorted array that has been rotated, find the index upto which array is sorted. For eg :- 3 4 5 6 1 2
	// ans is 3, because index of 6 is 3.
	public static void main(String[] args) {

//		System.out.println("Enter the no. of array elements to check : ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int a[] = {3,4,5,6,1,2};
		int i=0;
		for(i=0;i<6; i++) {
			if(a[i]<a[i+1])
				continue;
			else
				break;
		}
		System.out.println("array is sorted upto index : "+i);
		
	}

}
