package com.myMaven1.myMaven1;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Hello world!
 * 测试7提交 gggxxx
 * 
 */
public class App 
{
	// TaskUnit
	
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) throws Exception {
		Date now = new Date();
		testGetHours(now);
		
		
	}

	private static void testGetHours(Date now) throws Exception{
		System.out.println("now1 : " + now.getTime());


		Date parse = sdf.parse("2017-06-18 00:00:00");
		System.out.println("not parse: " + parse.getTime() + " " + parse.getHours());
	}
}
