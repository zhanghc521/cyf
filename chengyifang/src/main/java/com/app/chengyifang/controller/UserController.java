package com.app.chengyifang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.chengyifang.model.User;
import com.app.chengyifang.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping("/a")
	public User getUser(){
		return userService.getUser();
		
	}

}
