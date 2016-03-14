package com.dun.apigateway.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("hahamember")
public interface MemberClient {
	@RequestMapping(method = RequestMethod.GET, value = "/member/hello",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String helloWorld();
}
