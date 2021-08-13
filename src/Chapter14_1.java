import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Chapter14_1 {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int d = c.get(Calendar.DAY_OF_MONTH);
		d += 100;
		c.set(Calendar.DAY_OF_MONTH, d);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(f.format(future));
	}
}
