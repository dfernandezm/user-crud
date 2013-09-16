package com.kuluvalley.usercrud.model.user.service;

import com.kuluvalley.usercrud.model.user.User;
import com.kuluvalley.usercrud.model.user.dao.UserDao;
import com.kuluvalley.usercrud.model.user.dao.UserDaoImpl;
import com.kuluvalley.usercrud.model.user.exceptions.DuplicateUserException;
import com.kuluvalley.usercrud.model.user.exceptions.UserNotFoundException;
import com.kuluvalley.usercrud.ui.UserDTO;
import com.kuluvalley.usercrud.util.GeneralUtil;
import com.kuluvalley.usercrud.util.ObjectMapper;

/**
 * This is the business layer implementation: service layer, facade or API Endpoint
 * 
 * In this layer is where domain-specific logic is placed, transaction management, specific and persistence error handling, object mapping ... 
 * This logic can be supported by frameworks which implement Transaction manages, object mappers. 
 * 
 * A common example is Spring Framework which provides declarative Transaction management. It provides extremely powerful tooling to control
 * Transactions and failures in a declarative way.
 * 
 * 
 * @author David
 *
 */
public class UserServiceImpl implements UserService {

	// This has to be initialized or obtanied in some moment after initialization of the class (in Spring Framework, injected or obtained through a factory)
	// Now, for simplicity, directly instantiation...
	private UserDao userDao = new UserDaoImpl();
	private ObjectMapper mapper = new ObjectMapper();
	
	
	/**
	 * Creates a user, using an interface object (UserDTO, UserForm) to pass the data.
	 * Any checking such as duplication is performed here and informed through custom Exceptions the client has to handle 
	 * 
	 */
	public void create(UserDTO user) throws DuplicateUserException {
		// Code needed to create a user
		
		// this method defines an atomic operation, so it has to define a transaction boundary (write transaction).
		// This can be performed directly or declaratively
		// Either way, the following has to be handled (by the developer programatically or via framework):
		 // -> transaction creation or joining to an existing one depending on configuration
		 // -> commit or rollback the transaction
		 // -> catch and handle any exception thrown during the transaction, either internally related (Database problem, commit or rollback problem)
		 // -> if they are domain-specific, inform the client by throwing it
		
		// --- Begin transaction
		//1. Check if the user already exists, if it does -> throw DuplicateException, transaction rollback
		//2. Map UserDTO to User using objectMapper
		//3. With userDao call create operation, if error -> inform Client and rollback transaction
		//4. If ID is automatically generated, set it to the UserDTO and send it back to the client
		// --- End Transaction (commit)

		// Some code
		if(user.getName()!=null && userDao.existsName(user.getName())) {
			throw new DuplicateUserException();
			
		} else {
			
			//TODO: Here we would map to User from UserDTO using ObjectMapper	
			User u = new User();
			userDao.create(u);
		
			// if auto-generated id, we set it
			user.setUserId(u.getUserId());			
		}

	}


	public void delete(long userId) throws UserNotFoundException {
		// --- Begin transaction
		// checks whether a user with the provided id exists or not and inform -> rollback transaction
		// obtain the DAO and perform delete operation, if error -> rollback and inform
		// --- Commit transaction
		
		if(userDao.exists("userId", userId)) 
			throw new UserNotFoundException();
		else 
			userDao.delete(userId);
	}


	public UserDTO update(UserDTO user) throws UserNotFoundException, DuplicateUserException {
		
		// --- Begin transaction
		//
		// checks whether a user exists or not, if not, inform -> Not Found exception
		// checks if the update collide with existing user: Duplication exception or UpdatingException
		//  Map UserDTO to User using ObjectMapper
		// obtain the DAO and perform update operation, listen for persistence error -> if so, rollback
		// if successful, map back Userto UserDTO or retrieve provided UserDTO
		// --- Commit transaction
		
		if(userDao.exists("userId", user.getUserId())) {
			
			if(userDao.existsName(user.getName())) {
				throw new DuplicateUserException();
			} else {
				
				User userUpdating = mapper.map(user,User.class);
				userDao.update(userUpdating);
				return user;
			}
			
		} else
			throw new UserNotFoundException();
		
	}

	
	public UserDTO getUserById(long userId) throws UserNotFoundException {
		
		User user = userDao.getById(userId);
		UserDTO retrieved = mapper.map(user, UserDTO.class);
		
		if(user.getDateOfBirthMillis()!=0L)
			retrieved.setDateOfBirth(GeneralUtil.getFormattedDate(user.getDateOfBirthMillis()));
		
		return retrieved;
	}

}
