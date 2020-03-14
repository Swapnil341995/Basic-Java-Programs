package Day1_13;

import java.util.Arrays;

public class RemovingElementFromArray {
	
	public static void main(String[] args)
	{
		int arr[] = {1,3,5,7,9,2,4,6,8,10};
		int n = arr.length - 1;
		RemoveElement(arr,3);
	}
	
	public static void RemoveElement(int arr[],int element)
	{
		int l = 0;
		for (int i : arr) {
			if(arr[i] == element)
				l = i;
			break;
		}
		for (int k = l; k < arr.length - 1; k++) {
			arr[k] = arr[k + 1];
		}
		System.out.println(Arrays.toString(arr));
	}

}
