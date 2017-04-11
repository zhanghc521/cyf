package com.app.chengyifang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.chengyifang.mapper.HaveToKnowMapper;
import com.app.chengyifang.model.HaveToKnow;
import com.app.chengyifang.model.HaveToKnowExample;

@Service
public class HaveToKnowService {

	@Autowired
	HaveToKnowMapper haveToKnowMapper;
	
	
	public List<HaveToKnow> getHaveToKnows(){
		List<HaveToKnow> result = new ArrayList<HaveToKnow>();
		HaveToKnowExample example = new HaveToKnowExample();
		result = haveToKnowMapper.selectByExample(example);
		return result;
	}
}
