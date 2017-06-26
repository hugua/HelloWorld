package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cvter on 2017/6/5.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String indexHandler(){
        return "index";
    }
    @RequestMapping("/{pageName}")
    public String pageHandler(@PathVariable String pageName){
        return pageName;
    }

}
