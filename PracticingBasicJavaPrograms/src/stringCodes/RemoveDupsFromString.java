package stringCodes;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDupsFromString
{
	
	public static void main(String [] args)
	{
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char st[] = str.toCharArray();
		int index = 0;
		for(int i = 0;i < st.length;i++)
		{
			int j;
			for(j = 0;j < i;j++)
			{
				if(st[i] == st[j])
				{
					break;
				}
			}
				if(i == j)
				{
					st[index] = st[i];
					++index;
				}
		}
		System.out.println(String.valueOf(Arrays.copyOf(st, index))); 
	}
}
