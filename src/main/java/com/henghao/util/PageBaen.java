package com.henghao.util;

import java.util.List;
import java.util.Map;

public class PageBaen
{
  private int currentPage;
  private int pageSize;
  private int total;
  private Map<String, String> conditionMap;
  private List<?> list;
  
  public int getCurrentPage()
  {
    return this.currentPage;
  }
  
  public void setCurrentPage(int currentPage)
  {
    this.currentPage = currentPage;
  }
  
  public int getPageSize()
  {
    return this.pageSize;
  }
  
  public void setPageSize(int pageSize)
  {
    this.pageSize = pageSize;
  }
  
  public int getTotal()
  {
    return this.total;
  }
  
  public void setTotal(int total)
  {
    this.total = total;
  }
  
  public List<?> getList()
  {
    return this.list;
  }
  
  public void setList(List<?> list)
  {
    this.list = list;
  }
  
  public Map<String, String> getConditionMap()
  {
    return this.conditionMap;
  }
  
  public void setConditionMap(Map<String, String> conditionMap)
  {
    this.conditionMap = conditionMap;
  }
  
  public String toString()
  {
    return 
    
      "PageBaen [currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", total=" + this.total + ", conditionMap=" + this.conditionMap + ", rows=" + this.list + "]";
  }
}
