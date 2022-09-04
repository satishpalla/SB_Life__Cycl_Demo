package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class LifeCycleByAnnotations {
	
	@PostConstruct
	
public void start()
{
		System.out.println("Karthik initialized");
}

	
	@PreDestroy
	
	public void stop()
	{
		System.out.println("Karthik slept");
	}
}
