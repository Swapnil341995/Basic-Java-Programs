package Day1_13;

import java.util.Arrays;

public class SortingStringAndArray
{
	
	public static void main(String[] args)
	{
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		String str[] = {"pizza","pixer","z","a","d","c","b","as"};
		Arrays.sort(arr);
		Arrays.sort(str);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(str));
	}

}
