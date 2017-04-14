package com.app.chengyifang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.chengyifang.mapper.SceneryMapper;
import com.app.chengyifang.model.Scenery;
import com.app.chengyifang.model.SceneryExample;

@Service
public class SceneryService {

	@Autowired
	SceneryMapper sceneryMapper;
	
	/**
	 * 获取景点列表
	 * @return
	 */
	public List<Scenery> getScenerys(){
		List<Scenery> result = new ArrayList<Scenery>();
		SceneryExample example = new SceneryExample();
		result = sceneryMapper.selectByExample(example);
		return result;
	}

	public Scenery getSceneryById(String id){
		Scenery result = new Scenery();
		result = sceneryMapper.selectByPrimaryKey(id);
		return result;
	}
}
