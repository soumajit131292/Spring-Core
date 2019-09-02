package com.bridgelabz.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelabz.demo.carspecs.CarSpecs;

public class CarApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CarSpecs mycar = context.getBean("mycorolla",CarSpecs.class);
		System.out.println(mycar.specs());

	}

}
