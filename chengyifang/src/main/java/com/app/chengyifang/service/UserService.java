package com.app.chengyifang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.chengyifang.mapper.UserMapper;
import com.app.chengyifang.model.User;
import com.app.chengyifang.model.UserExample;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	
	
	public User getUser(){
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo("a");
		List<User> list = userMapper.selectByExample(example);
		
		return list.get(0);
	}
	
	public int getUserByUsernameAndPassword(String userName, String password){
		
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(userName);
		criteria.andPasswordEqualTo(password);
		List<User> users = new ArrayList<User>(); 
		users = userMapper.selectByExample(example);
		
		return users.size();
	}
	
}
