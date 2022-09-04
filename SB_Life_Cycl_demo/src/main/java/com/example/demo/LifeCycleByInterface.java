package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class LifeCycleByInterface  implements InitializingBean,DisposableBean{

	@Override
	public void destroy() throws Exception {
System.out.println("Bean Destroyed");		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean initiaized");
	}

}
