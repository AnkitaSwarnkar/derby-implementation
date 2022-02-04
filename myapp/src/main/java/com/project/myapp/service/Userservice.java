package com.project.myapp.service;
import java.util.List;    
import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service;  
import com.project.myapp.model.user;  
import com.project.myapp.repository.UserRepository;


@Service   
public class Userservice {
	
	@Autowired    
	private UserRepository userRepository;    
	public List<user> getAllUsers()  
	{    
	List<user>userRecords = new ArrayList<>();    
	userRepository.findAll().forEach(userRecords::add);    
	return userRecords;    
	}  
	
	
	public void addUser(user userRecord)  
	{    
	userRepository.save(userRecord);    
	}    

	

}
    
    
  