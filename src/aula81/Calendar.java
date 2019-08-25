package aula81;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Calendar {

	private static final String MINUTE = null;
	private static String MONTH;

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Minutes: " + minutes);
	
		

	}

	private int get(String minute2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void setTime(Date d) {
		// TODO Auto-generated method stub
		
	}

	private static Calendar getInstance() {
		// TODO Auto-generated method stub
		return null;
	}


}
