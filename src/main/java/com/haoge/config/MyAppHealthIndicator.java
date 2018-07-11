package com.haoge.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
@Component
public class MyAppHealthIndicator implements HealthIndicator{

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		
		//获取信息进行判断组件的状态
//		return Health.up().build();//代表组件健康
		return Health.down().withDetail("msg", "服务down掉了。。。").build();
	}
}
