package com.henghao.vo;

import java.util.List;

public class CarTestVo
{
  private String car_num;
  private List<String> itudeList;
  
  public String getCar_num()
  {
    return this.car_num;
  }
  
  public void setCar_num(String car_num)
  {
    this.car_num = car_num;
  }
  
  public List<String> getItudeList()
  {
    return this.itudeList;
  }
  
  public void setItudeList(List<String> itudeList)
  {
    this.itudeList = itudeList;
  }
}
