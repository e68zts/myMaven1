package com.myMaven1.myMaven1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 * yellow 提交1
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
        System.out.println( "Hello World! 2222 " );
        
        Date now = new Date();
        long nowTime = now.getTime();
        System.out.println("now: "+nowTime);
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        Date parse = sdf.parse("2017-07-18 00:00:00");
        System.out.println("not now: "+parse.getTime() + " "+parse.getHours());
        //TaskUnit
        
//        System.out.println( "-----------分割线----------" );
//        Date date = new Date();
//        int hours = date.getHours();
//        System.out.println(hours + " "+(24-15));
//        
//        System.out.println(new Date(parse.getTime()).getHours() +" "+((24-10)));
    }
}
