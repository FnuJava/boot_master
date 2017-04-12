package com.boot.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.boot.api.users.UserService;
import com.boot.service.user.UserServiceImpl;

@RestController
public class TestController{
	
	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	@Autowired private UserService userService;
	
	@RequestMapping("/")
    public String home() {
		userService.sayHell();
        return "Hello World!";
    }
	
}
