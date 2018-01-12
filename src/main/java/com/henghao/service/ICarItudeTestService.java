package com.henghao.service;

import com.henghao.common.domain.entity.CarItude;
import com.henghao.common.result.Result;

public abstract interface ICarItudeTestService
{
  public abstract Result addItude(CarItude paramCarItude);
  
  public abstract Result findAllItude();
  
  public abstract Result findLatest();
  
  public abstract Result positionDeviation(String paramString);
}
