package com.app.chengyifang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.chengyifang.model.InfoView;
import com.app.chengyifang.model.Scenery;
import com.app.chengyifang.service.InfoViewService;
import com.app.chengyifang.service.SceneryService;

/**
 * 小程序接口
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	SceneryService sceneryService;
	@Autowired
	InfoViewService infoViewService;

	@RequestMapping(value = "/scenerys", method = RequestMethod.POST)
	public List<Scenery> getScenerys(){
	
		List<Scenery> result = new ArrayList<Scenery>();
		result = sceneryService.getScenerys();
		return result;
	}
	
	@RequestMapping(value = "/infoViews", method = RequestMethod.POST)
	public List<InfoView> getInfoViews(){

		List<InfoView> result = new ArrayList<InfoView>();
		result = infoViewService.getInfoViews();
		return result;
		
	}
	@RequestMapping(value = "/scenery/{id}", method = RequestMethod.POST)
	public Scenery getScenery(@PathVariable String id){
	
		Scenery result = new Scenery();
		result = sceneryService.getSceneryById(id);
		return result;
	}
}
