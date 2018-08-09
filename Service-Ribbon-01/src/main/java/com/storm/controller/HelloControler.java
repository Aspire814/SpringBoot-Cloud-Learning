package com.storm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.storm.service.HelloService;

/**
 * @author 李斯
 * @date 2018年8月9日 上午11:22:45
 * @version V1.0
 */
@RestController
public class HelloControler {

	@Autowired
	HelloService helloService;

	@GetMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}
}