package com.myMaven1.myMaven1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Hello world!
 * this is App2
 * d
 * 
 */
public class App2 {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	
	public static void main(String[] args) throws Exception {
//		Date parse = sdf.parse("2017-07-18 00:00:00");
//		System.out.println("not now: " + parse.getTime() + " " + parse.getHours());

		testSetDate();

	}


	private static void testSetDate() throws Exception {
		// TODO Auto-generated method stub
		String s3 = "2017-07-18 02:15:15";
		Date parse3 = sdf.parse(s3);
		System.out.println("not now: " + s3 + " " + parse3.getHours());
		// TaskUnit
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(parse3.getTime());
		System.out.println("x:"+calendar.getActualMaximum(Calendar.DAY_OF_YEAR) + " : " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
//		calendar.setFirstDayOfWeek(Calendar.MONDAY);
//		calendar.set(Calendar.HOUR_OF_DAY, 3);
//		calendar.set(Calendar.MINUTE, 0);
//		calendar.set(Calendar.SECOND, 0);
//		calendar.set(Calendar.MILLISECOND, 0);
//		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//		Date time = calendar.getTime();
//		System.out.println("final：　" + sdf.format(time));
	}
}
