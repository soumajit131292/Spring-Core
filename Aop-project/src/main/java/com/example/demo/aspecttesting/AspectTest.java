package com.example.demo.aspecttesting;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectTest {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	// PointCut
	// JointPoint
	@Before("com.example.demo.aspecttesting.CommonJoinPoint.businessLayer()")
	public void before(JoinPoint joinPoint) {
		// Advice
		logger.info("check user is present or not then allow {} ", joinPoint);
	}

}
