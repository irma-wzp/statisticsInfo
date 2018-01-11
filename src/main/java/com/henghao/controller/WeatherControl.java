package com.henghao.controller;

import com.henghao.domain.entity.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/weather"})
/**
 * @author wzp
 * @description: 测试天气接口控制
 * @update on 2017/12/3.
 */
public class WeatherControl
{
  @RequestMapping({"/guiyang"})
  @ResponseBody
  public Result guiyang()
  {
    return null;
  }
}
