package com.app.chengyifang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.chengyifang.mapper.HaveToGoMapper;
import com.app.chengyifang.model.HaveToGo;
import com.app.chengyifang.model.HaveToGoExample;

@Service
public class HaveToGoService {

	@Autowired
	HaveToGoMapper haveToGoMapper;
	
	
	public List<HaveToGo> getHaveToGos(){
		List<HaveToGo> result = new ArrayList<HaveToGo>();
		HaveToGoExample example = new HaveToGoExample();
		result = haveToGoMapper.selectByExample(example);
		return result;
	}
}
