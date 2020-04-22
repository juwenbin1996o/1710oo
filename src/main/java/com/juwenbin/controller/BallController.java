package com.juwenbin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BallController {

	@RequestMapping("selects")
	public String selects(){
		
		return "selects";
	}
}
