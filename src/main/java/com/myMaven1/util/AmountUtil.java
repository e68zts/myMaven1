package com.myMaven1.util;

import java.math.BigDecimal;

public class AmountUtil {

	public static void main(String[] args) {

//		double f = 111231.5585;
//		BigDecimal b = new BigDecimal(f);
//		
//		double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//		System.out.println(f1);
//		
//		double f2 = b.setScale(2, BigDecimal.ROUND_DOWN).doubleValue();
//		System.out.println(f2);
//		test2();
		
		testCommon();
		
//		testBigDecimalContru();
	}

	private static void testBigDecimalContru() {
		// TODO Auto-generated method stub
//		BigDecimal b2=new BigDecimal(0.01);
//		
//		BigDecimal add = b1.add(b2);
//		System.out.println(add);
		
		BigDecimal b1=new BigDecimal(0.05+"");
		
		BigDecimal b2=new BigDecimal(0.01+"");
		
		BigDecimal add = b1.add(b2);
		System.out.println(add);
	}

	private static void testCommon() {
		// TODO Auto-generated method stub
//		double doubleValue = BigDecimal.valueOf((100 - 20) / 20 ).doubleValue();
//		double doubleValue2 = BigDecimal.valueOf(((100 - 20) / 20) ).doubleValue();
//		System.out.println(doubleValue + " "+doubleValue2);
//		(BigDecimal.valueOf((100 - 20) / 20 * 100).doubleValue());
//		 System.out.println(0.05 + 0.01);
//	    System.out.println(1.0 - 0.42);
//	    System.out.println(4.015 * 100);
//	    System.out.println(123.3 / 100);
//		BigDecimal b1=new BigDecimal(0.05);
//		BigDecimal b1=new BigDecimal("0.00");
//		
//		for (int i = 0; i < 10; i++) {
//			b1=b1.add(new BigDecimal(i+""));
//		}
		BigDecimal b1=new BigDecimal(0.05+"");
		
		BigDecimal b2=new BigDecimal(0.01+"");
		
		BigDecimal add = b1.multiply(b2);
		
//		BigDecimal.v
		
		System.out.println(add);

	}

	private static void test2() {
		// TODO Auto-generated method stub

		
		BigDecimal multiply = new BigDecimal(4.015).multiply(new BigDecimal(100));
		double doubleValue = multiply.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
									//setScale(2, BigDecimal.ROUND_DOWN).doubleValue();
		System.out.println(doubleValue);
//		System.out.println(multiply.doubleValue());
		
		
	}
}
