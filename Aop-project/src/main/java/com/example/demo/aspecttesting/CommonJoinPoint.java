package com.example.demo.aspecttesting;

import org.aspectj.lang.annotation.Pointcut;

//Managing all the poincut
public class CommonJoinPoint {

	@Pointcut("execution(* com.example.demo.Data.*.*(..))")
	public void dataLayer() {
	}

	@Pointcut("execution(* com.example.demo.business.*.*(..))")
	public void businessLayer() {
	}

}
