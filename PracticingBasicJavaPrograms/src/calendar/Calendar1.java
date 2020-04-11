package calendar;

import java.util.Calendar;
import java.util.Date;

public class Calendar1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("The current date is : " + calendar.getTime());
		calendar.add(Calendar.DATE, -15);
		System.out.println("15 days ago: " + calendar.getTime());
		calendar.add(Calendar.MONTH, 4);
		System.out.println("4 months later: " + calendar.getTime());
		calendar.add(Calendar.YEAR, 2);
		System.out.println("2 years later: " + calendar.getTime());
		Date date = Calendar.getInstance().getTime();
		System.out.println();
	}
}
