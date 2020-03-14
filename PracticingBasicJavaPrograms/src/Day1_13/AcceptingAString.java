package Day1_13;

import java.util.Scanner;

public class AcceptingAString {

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double mealCost = sc.nextDouble();
        double tipPercent = sc.nextDouble();
        double taxPercent = sc.nextDouble();

        double totalCost = mealCost + (mealCost * (tipPercent / 100)) + (mealCost * (taxPercent / 100));
        System.out.println(Math.round(totalCost));
    }
}