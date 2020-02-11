package Day1_13;

import java.util.Scanner;

public class SimpleInt {
	//finding the simple interest
	public static void main(String[] args) {
		
		System.out.println("Finding the simple interest");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount : ");
		double principle = sc.nextDouble();
		System.out.println("Enter the number of years : ");
		double noy = sc.nextDouble();
		System.out.println("Enter the rate of interest : ");
		double roi = sc.nextDouble();
		double si = (principle*noy*roi)/100;
		System.out.println("The simple interest is : "+si);
		
	}

}
