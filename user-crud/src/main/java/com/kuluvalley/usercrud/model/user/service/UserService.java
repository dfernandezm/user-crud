package com.kuluvalley.usercrud.model.user.service;

import com.kuluvalley.usercrud.model.user.exceptions.DuplicateUserException;
import com.kuluvalley.usercrud.model.user.exceptions.UserNotFoundException;
import com.kuluvalley.usercrud.ui.UserDTO;

/**
 * This is the interface of the business logic layer, which is shown to clients. It should contain only interface classes.
 * 
 * Each method should define an atomic use case or operation the client can perform, providing inteface Objects and Classes (DTOs, Data Transfer
 * Objects)
 * 
 * Each operation defines possible errors through checked Exceptions the client has to handle. Besides, every single operation 
 * can throw InternalErrorException that can be treated specifically or generically.
 * 
 * @author David
 *
 */
public interface UserService {
	
	void create(UserDTO user) throws DuplicateUserException; // or UserForm, but should not be User in order to separate interfaces and domain model
	void delete(long userId) throws UserNotFoundException;
	UserDTO update(UserDTO user) throws UserNotFoundException, DuplicateUserException;
	UserDTO getUserById(long userId) throws UserNotFoundException;
	
}
