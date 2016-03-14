package com.dun.apigateway.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dun.apigateway.consumer.service.HystrixMemberClient;


@RestController
public class DemoController {
	
	@Autowired
	private HystrixMemberClient hystrixMemberClient;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String demoTest(){
		return "来自member模块的"+hystrixMemberClient.helloWorld();
	}
}
