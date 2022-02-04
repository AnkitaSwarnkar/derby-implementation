package com.project.myapp.controller;
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.web.bind.annotation.RequestBody;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;    
import org.springframework.web.bind.annotation.RestController;  
import com.project.myapp.model.user;  
import com.project.myapp.service.Userservice;  
import java.util.List;


@RestController 
public class usercontroller {
	
	@Autowired    
	private Userservice userService;
	
	@RequestMapping("/")    
	public List<user> getAllUser()  
	{    
	return userService.getAllUsers();    
	}   
	
	@RequestMapping(value="/add-user", method=RequestMethod.POST)    
	public void addUser(@RequestBody user userRecord)  
	{    
	userService.addUser(userRecord);    
	} 
}

	

  