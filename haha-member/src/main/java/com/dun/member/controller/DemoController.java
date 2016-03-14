package com.dun.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class DemoController {
	
	@Value("${custom.message}")
	private String message;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String helloWorld(){
		return message;
	}
}
