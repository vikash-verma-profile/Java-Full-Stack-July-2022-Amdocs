package com.rest.webservices.restfulwebservices;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService service;
	
	@GetMapping("users")
	public List<User> retriveAllUsers(){
		return service.findAll();
	}
	
}
