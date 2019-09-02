package com.bridgelabz.demo.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bridgelabz.demo.carspecs.CarSpecs;
import com.bridgelabz.demo.carspecs.EngineSpecs;

@Component("myswift")
public class Swift implements CarSpecs {

	@Autowired
	@Qualifier("bs4 engine")
	private EngineSpecs engine;
	public String specs() {

		return "Dzire from Swift "+engine.engineSpecs();
	}

}