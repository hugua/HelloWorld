package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by chen on 2017/5/22.
 */
@Controller
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/user/{id}")
    @ResponseBody
    public User getUserById(@PathVariable  int id){
        return userService.getUserById(id);
    }
}
