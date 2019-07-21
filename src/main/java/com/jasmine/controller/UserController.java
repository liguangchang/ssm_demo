package com.jasmine.controller;

import com.jasmine.pojo.User;
import com.jasmine.service.UserService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/allUser")
    public List<User> getAllUser(){
        log.info("查数据");
        return userService.getAllUser();
    }
}
