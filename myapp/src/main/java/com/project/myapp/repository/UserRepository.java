package com.project.myapp.repository;
import org.springframework.data.repository.CrudRepository;  
import com.project.myapp.model.user;   

public interface UserRepository extends CrudRepository<user, String>   
{
	
	
}   
