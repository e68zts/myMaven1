package com.myMaven1.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DXSCommonDateTimeUtil {

	public static void main(String[] args) throws Exception {
		long todayTime = new Date().getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        Date parse = sdf.parse("2017-07-18 00:00:00");
		
        boolean greaterThanToday = greaterThanToday(parse.getTime());
        System.out.println(greaterThanToday);
	}
	public static boolean greaterThanToday(long time) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
//        calendar.add(Calendar.DAY_OF_YEAR, 1);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR)+1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date time2 = calendar.getTime();
        
        
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("compare Time ;"+sdf.format(time2));
		
        
        if (time > calendar.getTimeInMillis())
            return true;
        return false;
    }

}
