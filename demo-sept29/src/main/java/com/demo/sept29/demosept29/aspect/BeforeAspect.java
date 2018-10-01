package com.demo.sept29.demosept29.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	
	Logger log = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.demo.sept29.demosept29.controller.*.*(..))")
	public void checkUserName(){
			log.info("Before Pointcut");
	}

	@After("execution(* com.demo.sept29.demosept29.controller.*.*(..))")
	public void checkResponse(){
			log.info("After Pointcut");
	}
	
}
