package com.bmtaholic.badminton.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static String getToday4yyyyMMdd() {
		return getTodayByPattern("yyyyMMdd");
	}

	public static String getToday4HHmmss() {
		return getTodayByPattern("HHmmss");
	}

	public static String getToday4yyyyMMddHHmmss() {
		return getTodayByPattern("yyyyMMddHHmmss");
	}

	public static String getTodayByPattern(String pattern) {
		return getDateString(new Date(), pattern);
	}

	public static String getDateString(Date time, String pattern) {
		SimpleDateFormat dateFormater = new SimpleDateFormat(pattern);
		return dateFormater.format(time);
	}
	
	
}
