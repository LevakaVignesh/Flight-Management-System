package com.fms.services;



import org.springframework.http.ResponseEntity;

import com.fms.entity.User;
import com.fms.exceptions.InvalidCredentialsException;
import com.fms.exceptions.RecordNotFoundException;

public interface UserService {
	public String login(String userId,String password) throws InvalidCredentialsException;
	public  String addUser(User user); 
	public String viewUser(String userId)throws RecordNotFoundException;
	public String removeUser(String UserId) ;//throws UserNotFoundException;
	public String updateUser(String userId,User user);
}
