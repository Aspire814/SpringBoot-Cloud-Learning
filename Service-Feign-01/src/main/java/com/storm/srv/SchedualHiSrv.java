package com.storm.srv;

import com.storm.intf.SchedualServiceHi;

/**
 * @author 李斯
 * @date 2018年8月9日 下午5:14:36 
 * @version V1.0
 */
public class SchedualHiSrv implements SchedualServiceHi{//本地服务

	@Override
	public String sayHiFromClientOne(String name) {
		return "hi feign";
	}

}
