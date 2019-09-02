package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Data.DataTwo;

@Service
public class BusinessTwo {

	@Autowired
	private DataTwo dataTwo;

	public String calculate() {
		return dataTwo.retriveSomething();
	}

}
