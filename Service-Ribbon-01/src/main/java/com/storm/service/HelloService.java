package com.storm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 李斯
 * @date 2018年8月9日 上午11:19:56 
 * @version V1.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {//ribbon中它会根据服务名来选择具体的服务实例
        return restTemplate.getForObject("http://SERVICE-01/hi?name="+name,String.class);
    }

}