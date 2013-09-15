package com.kuluvalley.usercrud.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Helper class where some general utility methods are defined in order to avoid code repetition throughout the project
 * 
 * @author David
 *
 */
public class GeneralUtil {

	/**
	 * Converts a date given as milliseconds to Calendar instance
	 * 
	 * Note: This can be performed using objectMappers built-in conversion services or called from them
	 * 
	 * @param dateInMillis: the date in milliseconds
	 * @return
	 */
	public static Calendar getCalendar(long dateInMillis) {
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(dateInMillis);
		return c;
	}
	
	/**
	 * Useful method to format dates in a specific format without relying on external view technologies
	 * Note: in a real environment we have to take care of locales and perform further checks
	 */
	public static String getFormattedCalendar(Calendar date) {
		
		DateFormat d = new SimpleDateFormat(GlobalParameters.PREFERRED_DATE_FORMAT);
		String str = d.format(date.getTime());
		
		return str;
	}
	
	
	public static String getFormattedDate(long dateInMillis) {
		
		Calendar calendar = getCalendar(dateInMillis);
		String calendarStr = getFormattedCalendar(calendar);
		
		return calendarStr;
	}
}
