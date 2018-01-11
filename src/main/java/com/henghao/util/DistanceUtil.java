package com.henghao.util;

public class DistanceUtil
{
  private static final Double PI = Double.valueOf(3.141592653589793D);
  private static final Double PK = Double.valueOf(180.0D / PI.doubleValue());
  
  public static double getDistanceFromTwoPoints(double lat_a, double lng_a, double lat_b, double lng_b)
  {
    double t1 = Math.cos(lat_a / PK.doubleValue()) * Math.cos(lng_a / PK.doubleValue()) * Math.cos(lat_b / PK.doubleValue()) * Math.cos(lng_b / PK.doubleValue());
    double t2 = Math.cos(lat_a / PK.doubleValue()) * Math.sin(lng_a / PK.doubleValue()) * Math.cos(lat_b / PK.doubleValue()) * Math.sin(lng_b / PK.doubleValue());
    double t3 = Math.sin(lat_a / PK.doubleValue()) * Math.sin(lat_b / PK.doubleValue());
    double tt = Math.acos(t1 + t2 + t3);
    return 6366000.0D * tt;
  }
}
