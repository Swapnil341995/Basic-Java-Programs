package Day1_13;

import java.util.*;

public class Socks {
	public static void main(String args[]) {
		int NoOfSocks = sockMerchant();
		System.out.println(NoOfSocks);
	}

	static int sockMerchant() {
		System.out.println("Enter the no. of socks : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the sock "+(i+1));
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int flag = 0;
		for (int i = 0; i < n; i++) {
			flag = 0;
			int j = i + 1;
			while (j < n) {
				if (arr[i] == arr[j]) {
					flag++;
				}
				j++;
			}
			if (flag % 2 == 1) {
				count++;
			}
		}
		return count;
	}

}
