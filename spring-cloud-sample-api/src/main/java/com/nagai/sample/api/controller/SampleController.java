package com.nagai.sample.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping(value="/")
	public String helloWorld(@Value("${api.prop.test}")String value){
		return "HELLO WORLD "+value;
	}
	
	
	
}
