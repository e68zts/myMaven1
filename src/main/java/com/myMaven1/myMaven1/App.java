package com.myMaven1.myMaven1;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Hello world!
 * 从git修改
 我还想从git修改一下啊     上大夫按时发但是发生的发送的 
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
