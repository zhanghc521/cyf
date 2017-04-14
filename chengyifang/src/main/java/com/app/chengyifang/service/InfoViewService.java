package com.app.chengyifang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.chengyifang.mapper.InfoViewMapper;
import com.app.chengyifang.model.InfoView;
import com.app.chengyifang.model.InfoViewExample;

@Service
public class InfoViewService {

	@Autowired
	InfoViewMapper infoViewMapper;
	
	
	public List<InfoView> getInfoViews(){
		List<InfoView> result = new ArrayList<InfoView>();
		InfoViewExample example = new InfoViewExample();
		result = infoViewMapper.selectByExample(example);
		return result;
	}
	
}
