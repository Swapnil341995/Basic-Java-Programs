package Day1_13;

import java.util.Scanner;

public class Area_Circumference {
	
	//program to find area and circumference of a circle
	
	public static void main(String[] args) {
		
		System.out.println("Finding area and circumference of a circle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of a circle : ");
		int rad = sc.nextInt();
		double pi = 3.14;
		System.out.println("The area of a circle is : "+pi*rad*rad);
		System.out.println("The circumference of a circle is : "+2*pi*rad);
	}

}
