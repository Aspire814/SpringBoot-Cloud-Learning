package com.storm.intf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.storm.srv.SchedualServiceHiHystric;

/**
 * @author 李斯
 * @date 2018年8月9日 上午11:30:45 
 * @version V1.0
 */
@FeignClient(value = "eureka-client-02",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}