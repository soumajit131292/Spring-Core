package com.example.demo.aspecttesting;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspcetArround {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Around("execution(* com.example.demo.business.*.*(..))")
	public void before(ProceedingJoinPoint joinPoint) throws Throwable {
		// Advice
		long startTime = System.currentTimeMillis();

		joinPoint.proceed();

		long timeTaken = System.currentTimeMillis() - startTime;

		logger.info("{} took time of {} ", joinPoint, timeTaken);
	}

}
