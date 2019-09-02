package com.bridgelabz.demo.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bridgelabz.demo.carspecs.CarSpecs;
import com.bridgelabz.demo.carspecs.EngineSpecs;
@Component("mycorolla")
public class Corolla implements CarSpecs {

	@Autowired
	@Qualifier("bs6 engine")
	private EngineSpecs engine;
	public String specs() {

		return "Toyota from Corolla "+engine.engineSpecs();
	}

}
