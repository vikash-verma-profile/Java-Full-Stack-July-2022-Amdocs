package com.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//get
	//url /hello-world
	@RequestMapping(method=RequestMethod.GET,path="hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	
}
