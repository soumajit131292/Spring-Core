package com.bridgelabz.demo.cars;

import org.springframework.stereotype.Component;

import com.bridgelabz.demo.carspecs.CarSpecs;
@Component("mycorolla")
public class Corolla implements CarSpecs {

	
	
	public String specs() {

		return "Toyota from Corolla";
	}

}
