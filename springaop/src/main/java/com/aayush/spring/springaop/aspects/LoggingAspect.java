package com.aayush.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution( * com.aayush.spring.springaop.service.impl.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinpoint) {
		System.out.println("Before calling the method");
	}

	@After("execution( * com.aayush.spring.springaop.service.impl.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinpoint) {
		System.out.println("After calling the method");
	}
}
