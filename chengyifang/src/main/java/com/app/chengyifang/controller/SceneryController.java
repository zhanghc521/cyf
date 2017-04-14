package com.app.chengyifang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.chengyifang.model.Scenery;

@RestController
@RequestMapping("scenery")
public class SceneryController {

	@RequestMapping("scenery")
	public Scenery getSceneryById(String id){
		return null;
	}
}
