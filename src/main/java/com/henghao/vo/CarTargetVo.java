package com.henghao.vo;

public class CarTargetVo
{
  private String DESTINATIONS;
  private String ORIGIN;
  private String STARTTIME;
  private String ENDTIME;
  private String CARNO;
  
  public String getDESTINATIONS()
  {
    return this.DESTINATIONS;
  }
  
  public void setDESTINATIONS(String dESTINATIONS)
  {
    this.DESTINATIONS = dESTINATIONS;
  }
  
  public String getORIGIN()
  {
    return this.ORIGIN;
  }
  
  public void setORIGIN(String oRIGIN)
  {
    this.ORIGIN = oRIGIN;
  }
  
  public String getSTARTTIME()
  {
    return this.STARTTIME;
  }
  
  public void setSTARTTIME(String sTARTTIME)
  {
    this.STARTTIME = sTARTTIME;
  }
  
  public String getENDTIME()
  {
    return this.ENDTIME;
  }
  
  public void setENDTIME(String eNDTIME)
  {
    this.ENDTIME = eNDTIME;
  }
  
  public String getCARNO()
  {
    return this.CARNO;
  }
  
  public void setCARNO(String cARNO)
  {
    this.CARNO = cARNO;
  }
  
  public String toString()
  {
    return 
    
      "CarTargetVo [DESTINATIONS=" + this.DESTINATIONS + ", ORIGIN=" + this.ORIGIN + ", STARTTIME=" + this.STARTTIME + ", ENDTIME=" + this.ENDTIME + ", CARNO=" + this.CARNO + "]";
  }
}
