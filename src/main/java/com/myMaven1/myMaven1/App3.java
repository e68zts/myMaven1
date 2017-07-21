package com.myMaven1.myMaven1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App3 {
	static SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) throws Exception {

//		TimeUnit rtn = TimeUnit.
		
		testSetBeforDatexxx();

	}

	private static void testSetBeforDatexxx() throws Exception {
		
		String s3 = "2017-07-02 09:15:15";
		Date beginDate = dft.parse(s3);
		
		System.out.println("now: " +s3);
		Calendar calendarDate = Calendar.getInstance();
		calendarDate.setTime(beginDate);
		
//		System.out.println("结果：" + calendarDate.get(Calendar.YEAR));//
//		printSub1(calendarDate,Calendar.YEAR);//
		
//		System.out.println("结果：" + calendarDate.get(Calendar.MONTH));//0
//		printSub1(calendarDate,Calendar.MONTH);//2016-12-18 02:15:15
		
		calendarDate.setFirstDayOfWeek(Calendar.MONDAY);
		//http://blog.csdn.net/liuyifeng1920/article/details/53582092  WEEK_OF_MONTH 与WEEK_OF_YEAR
		System.out.println("结果：" + calendarDate.get(Calendar.WEEK_OF_MONTH));//0
//		printSub1(calendarDate,Calendar.DAY_OF_WEEK);//2016-12-18 02:15:15
		
		
		
		int days = calendarDate.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("getActualMaximum: "+days);
//		
//		calendarDate.set(Calendar.MONTH, calendarDate.get(Calendar.MONTH) - 1 );
////		Date time = calendarDate.getTime();
//		System.out.println("设置之后： "+dft.format(calendarDate.getTime()));
	}

	private static void printSub1(Calendar calendarDate,int i) {
		calendarDate.set(i, calendarDate.get(i) - 1);
		System.out.println(dft.format(calendarDate.getTime()));//
	}
}
