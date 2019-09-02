package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.business.BusinessOne;
import com.example.demo.business.BusinessTwo;

@SpringBootApplication
public class AopProjectApplication implements CommandLineRunner {

	@Autowired
	private BusinessOne businessOne;

	@Autowired
	private BusinessTwo businessTwo;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(AopProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// logger.info(dataOne.retriveSomething());
		logger.info(businessOne.calculate());
		logger.info(businessTwo.calculate());

	}

}
