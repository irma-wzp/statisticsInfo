package com.henghao.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils
{
  public static String getCurrentDate(String format)
  {
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    return sdf.format(new Date());
  }
  
  public static Date getCurrentDateT(String format)
    throws Exception
  {
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    String dateStr = sdf.format(new Date());
    return sdf.parse(dateStr);
  }
  
  public static Date getCurrent(String format)
    throws Exception
  {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date dateStr = sdf.parse(format);
    return dateStr;
  }
  
  public static String getFormatedDate(Date date, String format)
  {
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    return sdf.format(date);
  }
  
  public static Date parseDateFromString(String date)
    throws ParseException
  {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return sdf.parse(date);
  }
  
  public static Date parseDateFromString(String date, String format)
    throws ParseException
  {
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    return sdf.parse(date);
  }
  
  public static String getSpecifiedDayAfter(String specifiedDay)
  {
    Calendar c = Calendar.getInstance();
    Date date = null;
    try
    {
      date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
    }
    catch (ParseException e)
    {
      e.printStackTrace();
    }
    c.setTime(date);
    int day = c.get(5);
    c.set(5, day + 1);
    
    String dayAfter = new SimpleDateFormat("yyyy-MM-dd")
      .format(c.getTime());
    return dayAfter;
  }
  
  public static String getSpecifiedDayAfter(String specifiedDay, String fomat)
  {
    Calendar c = Calendar.getInstance();
    Date date = null;
    try
    {
      date = new SimpleDateFormat(fomat).parse(specifiedDay);
    }
    catch (ParseException e)
    {
      e.printStackTrace();
    }
    c.setTime(date);
    int day = c.get(5);
    c.set(5, day + 1);
    
    String dayAfter = new SimpleDateFormat(fomat)
      .format(c.getTime());
    return dayAfter;
  }
  
  public static int getCurrentMonthLastDay()
  {
    Calendar a = Calendar.getInstance();
    a.set(5, 1);
    a.roll(5, -1);
    int maxDate = a.get(5);
    return maxDate;
  }
  
  public static int getMonthLastDay(int year, int month)
  {
    Calendar a = Calendar.getInstance();
    a.set(1, year);
    a.set(2, month - 1);
    a.set(5, 1);
    a.roll(5, -1);
    int maxDate = a.get(5);
    return maxDate;
  }
}
