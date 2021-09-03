package chapter14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		Date d = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		String s = f.format(d);
		System.out.println(s);
	}
}
