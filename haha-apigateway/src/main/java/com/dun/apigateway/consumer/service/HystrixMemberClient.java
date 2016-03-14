package com.dun.apigateway.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dun.apigateway.consumer.feign.MemberClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service("hystrixMemberClient")
public class HystrixMemberClient {
	
	@Autowired
	private MemberClient memberClient;
	
	@HystrixCommand(groupKey = "memberGroup", fallbackMethod = "fallBackCall")
	public String helloWorld(){
		return memberClient.helloWorld();
	}
	
	public String fallBackCall(){
		return "error";
	}
}
