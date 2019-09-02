package com.bridgelabz.demo.engine;

import org.springframework.stereotype.Component;

import com.bridgelabz.demo.carspecs.EngineSpecs;
@Component("bs6 engine")
public class BsVI implements EngineSpecs{

	public String engineSpecs() {
		
		return "BS6 ENGINE";		
	}

}