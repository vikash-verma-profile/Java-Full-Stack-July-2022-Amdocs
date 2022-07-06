package com.rest.webservices.restfulwebservices;

import java.util.*;
import org.springframework.stereotype.*;

@Component
public class UserDaoService {

	private static List<User> users=new ArrayList<User>();
	private static int usersCount=3;
	
	static {
		users.add(new User(1,"Vikash Verma 1",new Date()));
		users.add(new User(2,"Vikash Verma 2",new Date()));
		users.add(new User(3,"Vikash Verma 3",new Date()));
	}
	
	public List<User> findAll(){
		return users;	
		}
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
}
