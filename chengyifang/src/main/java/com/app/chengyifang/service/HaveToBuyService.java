package com.app.chengyifang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.chengyifang.mapper.HaveToBuyMapper;
import com.app.chengyifang.model.HaveToBuy;
import com.app.chengyifang.model.HaveToBuyExample;

@Service
public class HaveToBuyService {

	@Autowired
	HaveToBuyMapper haveToBuyMapper;
	
	
	public List<HaveToBuy> getHaveToBuys(){
		List<HaveToBuy> result = new ArrayList<HaveToBuy>();
		HaveToBuyExample example = new HaveToBuyExample();
		result = haveToBuyMapper.selectByExample(example);
		return result;
	}
}
