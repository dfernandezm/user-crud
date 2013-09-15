package com.kuluvalley.usercrud.controller.formbased;

import com.kuluvalley.usercrud.model.user.exceptions.UserNotFoundException;
import com.kuluvalley.usercrud.model.user.service.UserService;
import com.kuluvalley.usercrud.ui.UserDTO;
import com.kuluvalley.usercrud.util.ObjectMapper;

/**
 * Controller Layer
 * 
 * Example stub implementation of a Controller to create, delete or update users.
 * 
 * In a web environment a framework should be used to avoid excesive boilerplate and density of Servlets API.
 * 
 * It can be modified to be used as REST API Endpoint or keep it as usual URL-based web administration backend
 * 
 * 
 * @author David
 *
 */
public class UserController {

	// obtain the business logic, through dependency injection, factory ...
	private UserService userService;
	@SuppressWarnings("unused")
	private ObjectMapper mapper = new ObjectMapper();
	@SuppressWarnings("unused")
	private UserValidator userValidator;
	
	/**
	 * Shows a form to create a user. If userId is provided, shows a filled form with current data
	 * 
	 * @param userdId
	 * @return
	 * @throws UserNotFoundException 
	 */
	// Mapping to URL /user/create with method GET
	@SuppressWarnings("unused")
	public String showUserGet(Long userId) { // This exception can be generally handled or specifically
	
		UserDTO userForm = new UserDTO();

		try {
			if(userId!=null) {
				
				userForm = userService.getUserById(userId);
				
				// leave userForm in request and render view
				return "updateUserViewName";
			}
		} catch (UserNotFoundException e) {
			
			// Redirect to error page or render message indicating the user requested was not found
		}
		
		// leave userForm in request then render view
		return "createUserViewName";
	}
	// Mapping to URL /user/create with method POST
	public String createUserPost(UserDTO userDTO) {
		
		// perform validation
		
		// if successful, create in database and render successful view or redirect to results page
		
		// if validation error, render form with errors
		
		return "viewName";
	}
	
	// Mapping to URL /user/update with method POST
	public String updateUserPost(UserDTO userDTO) {
		
		// can rely on most of the code implemented for createUserPost method, listening for specific update errors
		
		return "viewName";
	}
	
	
	
	
	
}
