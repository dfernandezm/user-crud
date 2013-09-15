package com.kuluvalley.usercrud.model.user.dao;

import com.kuluvalley.usercrud.model.user.User;
import com.kuluvalley.usercrud.model.util.GenericDao;


/**
 * Here it is defined the DAO layer, which allows accessing persistence of the User entity and provide the functionality needed to create, update
 * or delete a User.
 * 
 * The CRUD operations (as well as another domain-specific common operations) are usually generalized and put in a superclass parameterized DAO (interface
 * and implementation). This superclasses are extended by the specific DAOs of the domain.
 * 
 * In this case I left blank GenericDao on purpose and define the operations in the specific one, but in a large environment these common operations should
 * be in the GenericDao.
 * 
 * @author David
 *
 */
public interface UserDao extends GenericDao<User> {

	
	void create(User user);
	void delete(Long userId);
	User update(User user);
	Boolean existsName(String name);
	
}
