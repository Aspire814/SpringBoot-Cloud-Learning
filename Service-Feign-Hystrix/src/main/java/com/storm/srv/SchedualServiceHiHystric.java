package com.storm.srv;

import org.springframework.stereotype.Component;

import com.storm.intf.SchedualServiceHi;

/**
 * @author 李斯
 * @date 2018年8月9日 上午11:58:30 
 * @version V1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}