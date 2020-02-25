package Day1_13;

import java.util.Scanner;

public class RevWords {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		String splitArray[] = n.split(" ");
		
		for(int i = splitArray.length-1;i >= 0;i-- )
		{
			System.out.print(splitArray[i]+" ");
		}
		
	}

}
