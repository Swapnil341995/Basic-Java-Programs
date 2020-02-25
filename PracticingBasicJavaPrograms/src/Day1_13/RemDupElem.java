package Day1_13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemDupElem {

	public static void main(String[] args) {

		
		System.out.println("Enetr the number of elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i < n;i++) {
		System.out.println("Enter the "+ (i+1) +" element : ");
			a[i] = (int) sc.nextInt();
		}
		
		Set<Integer> hs = new HashSet<>();
		for(int i = 0;i < n;i++) {
			if(!hs.add(a[i])) {
				System.out.println("duplicate element is : "+a[i]+" at "+i+"th position");
			}
		}
	}

}
