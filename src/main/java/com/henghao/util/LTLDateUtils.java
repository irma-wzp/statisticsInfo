package com.henghao.util;

public class LTLDateUtils
{
  public static Integer getMinuteByDoTime(String doTime)
  {
    Integer millis = Integer.valueOf(0);
    if ((doTime != null) && (!"".equals(doTime)))
    {
      Integer day = Integer.valueOf(Integer.parseInt(doTime.substring(0, doTime.indexOf("天")).trim()));
      Integer hour = Integer.valueOf(Integer.parseInt(doTime.substring(doTime.indexOf("天") + 1, doTime.indexOf("时")).trim()));
      Integer minute = Integer.valueOf(Integer.parseInt(doTime.substring(doTime.indexOf("时") + 1, doTime.indexOf("分")).trim()));
      millis = Integer.valueOf(hour.intValue() * 60 + minute.intValue() + day.intValue() * 24 * 60);
    }
    return millis;
  }
  
  public static void main(String[] args) {}
}
