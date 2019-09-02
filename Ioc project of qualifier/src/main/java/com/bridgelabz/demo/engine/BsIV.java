package com.bridgelabz.demo.engine;

import org.springframework.stereotype.Component;

import com.bridgelabz.demo.carspecs.EngineSpecs;
@Component("bs4 engine")
public class BsIV implements EngineSpecs{

	public String engineSpecs() {
		return "BS4 ENGINE";
		
	}

}
