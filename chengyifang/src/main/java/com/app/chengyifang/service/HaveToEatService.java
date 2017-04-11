package com.app.chengyifang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.chengyifang.mapper.HaveToEatMapper;
import com.app.chengyifang.model.HaveToEat;
import com.app.chengyifang.model.HaveToEatExample;

@Service
public class HaveToEatService {


	@Autowired
	HaveToEatMapper haveToEatMapper;
	
	
	public List<HaveToEat> getHaveToEats(){
		List<HaveToEat> result = new ArrayList<HaveToEat>();
		HaveToEatExample example = new HaveToEatExample();
		result = haveToEatMapper.selectByExample(example);
		return result;
	}
}
