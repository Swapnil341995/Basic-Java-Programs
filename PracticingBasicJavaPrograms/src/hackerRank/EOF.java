package hackerRank;

import java.util.Scanner;

public class EOF {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String line;
		int lines = 0;
		try {
			while (true) {
				line = scan.nextLine();
				if (line == null)
					return;
				if (lines > 0)
					System.out.println();
				System.out.print((lines + 1) + " " + line);
				lines++;
			}
		} catch (Exception e) {

		}
	}

}
