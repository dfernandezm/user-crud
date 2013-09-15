package com.kuluvalley.usercrud.controller.rest;

import com.kuluvalley.usercrud.model.user.exceptions.DuplicateUserException;
import com.kuluvalley.usercrud.model.user.exceptions.UserNotFoundException;
import com.kuluvalley.usercrud.model.user.service.UserService;
import com.kuluvalley.usercrud.ui.UserDTO;
import com.kuluvalley.usercrud.util.ObjectMapper;

/**
 * Controller Layer, REST API Endpoint. It should be considered that this operations may required authentication (not implemented)
 * 
 * Stub implementation of a RESTful Controller to create, delete or update users.
 * 
 * @author David
 *
 */
public class UserController {

	// obtain the business logic, through dependency injection, factory ...
	private UserService userService;
	@SuppressWarnings("unused")
	private ObjectMapper mapper = new ObjectMapper(); // can be used to map between more specific objects
	

	// Mapping to URL /user/create with method GET, Accept application/json ; Content-Type: application/json or corresponding format
	public void createUser(UserDTO user) { 
	
		UserDTO userDTO = new UserDTO();

		try {
			userService.create(userDTO);
		} catch (DuplicateUserException e) {
			
			// Set Bad Request or other HTTP code to indicate duplication error
		}
		
		// if internal error, set 500 error code or similar to indicate internal server error
		
		// set status 200 OK
	}

	
	// Mapping to URL /user/update with method PUT, produces application/json or corresponding format
	public UserDTO updateUser(UserDTO userDTO) {
		
		// perform some validation or just rely on service layer...
		
		UserDTO userUpdated;
		try {
			
			// map to JSON or the corresponding format and retrieve
			// Set 200 OK status	
		
			userUpdated = userService.update(userDTO);
			return userUpdated;
			
		} catch (UserNotFoundException e) {
			// Set 404 Not Found, return a JSON informing 
		} catch (DuplicateUserException e) {
			// Set Bad Request or other error status to inform of duplication optionally with JSON error object
		}
		
		// Return other json object with information about errors
		return null;
	}
	
	
	// Mapping to URL /user/delete with method DELETE
	public void  deleteUser(Long userId) {
		
		if(userId == null) {
			// Status Bad Request
		} else {
			
			// 200 OK
			try {
				userService.delete(userId);
			} catch (UserNotFoundException e) {
				// Set 404 Not Found, and may return a JSON informing (requires changing return type)
			}
		}
		
	}
	
	
	
}
