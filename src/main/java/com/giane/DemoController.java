package com.giane;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright(c) 2016 Creactives SPA - All rights reserved
 * User: matteo.gianello
 * Date: 17/11/2016
 * Time: 17:58
 *
 * @author Creactives SPA
 * @version 1.0
 */
@Controller
public class DemoController {
  @RequestMapping("/home")
  public String getIndex(){
    return "index";
  }
}
