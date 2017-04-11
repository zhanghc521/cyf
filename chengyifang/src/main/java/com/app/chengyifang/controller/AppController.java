package com.app.chengyifang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.chengyifang.model.HaveToBuy;
import com.app.chengyifang.model.HaveToEat;
import com.app.chengyifang.model.HaveToGo;
import com.app.chengyifang.model.HaveToKnow;
import com.app.chengyifang.service.HaveToBuyService;
import com.app.chengyifang.service.HaveToEatService;
import com.app.chengyifang.service.HaveToGoService;
import com.app.chengyifang.service.HaveToKnowService;

/**
 * 小程序接口
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	HaveToEatService haveToEatService;
	@Autowired
	HaveToGoService haveToGoService;
	@Autowired
	HaveToKnowService haveToKnowService;
	@Autowired
	HaveToBuyService haveToBuyService;

	@RequestMapping(value = "/haveToEats", method = RequestMethod.GET)
	public List<HaveToEat> getHaveToEats(){
	
		List<HaveToEat> result = new ArrayList<HaveToEat>();
		haveToEatService.getHaveToEats();
		return result;
	}
	@RequestMapping(value = "/haveToGos", method = RequestMethod.POST)
	public List<HaveToGo> getHaveToGos(){
		List<HaveToGo> result = new ArrayList<HaveToGo>();
		haveToGoService.getHaveToGos();
		return result;
	}
	@RequestMapping(value = "/haveToKnows", method = RequestMethod.POST)
	public List<HaveToKnow> getHaveToKnows(){
		List<HaveToKnow> result = new ArrayList<HaveToKnow>();
		haveToKnowService.getHaveToKnows();
		return result;
	}
	@RequestMapping(value = "/haveToBuys", method = RequestMethod.POST)
	public List<HaveToBuy> getHaveToBuys(){
		List<HaveToBuy> result = new ArrayList<HaveToBuy>();
		haveToBuyService.getHaveToBuys();
		return result;
	}
}
