package com.example.demo.aspecttesting;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectAfter {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	//After method execution it will return 
	
	@AfterReturning(value = "execution(* com.example.demo..*.*(..))", returning = "result")
	public void before(JoinPoint joinPoint, Object result) { // Advice
		logger.info("{}returns this {} ", joinPoint, result);
	}

	@AfterThrowing(value = "execution(* com.example.demo..*.*(..))", throwing = "exception")
	public void before(JoinPoint joinPoint, Exception exception) {
		// Advice
		logger.info("{}returns this {} ", joinPoint, exception);
	}

	@After(value = "execution(* com.example.demo.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		// Advice
		logger.info("after excecution {} ", joinPoint);
	}

}
