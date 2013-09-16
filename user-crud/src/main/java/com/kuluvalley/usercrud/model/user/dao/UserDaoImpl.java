package com.kuluvalley.usercrud.model.user.dao;

import com.kuluvalley.usercrud.model.user.User;
import com.kuluvalley.usercrud.model.util.GenericDaoSpecificVendor;

/**
 * 	
 * Here should be the specific implementation of the queries needed to persist. This depends on the persistence vendor or technology 
 * (raw JDBC, Hibernate, general JPA, JDO, iBatis...)
 *	
 *  Persistence specific Errors should be detected and thrown as Exceptions unless the technology allows transparent persistence exceptions translation
*   and management such as Hibernate-Spring. Anyway, this or a another mechanism has to be present in order to keep the integrity of the data 
 * 
 * @author David
 *
 */
public class UserDaoImpl extends GenericDaoSpecificVendor<User> implements UserDao {


	public void create(User user) /* throws PersistenceException */ {
		
		/* Code to persist a user, if it is a database environment, this method has to be executed in a transaction whose boundaries are usually defined 
		 by its caller, because this operation could be part of another process (a step in a larger transactional process)
		
		 The domain-specific checks needed to know if the user entity passed meets the requirements to be persisted must be done in the Business Logic
		 layer.
		 
		
		 */
	
	}
	

	public void delete(Long userId) {
		// Code to delete a user. 
		
		// The user whose id is provided might not be found so a specific-domain Exception is thrown to inform. This Exception should be checked, not
		// carrying out a rollback of the current transaction. This check usually is done by the Business Layer logic.
		
	}

	public User update(User user) {
		// Code to update a user, the specific checkings to know whether is possible or not should be done in Business Logic Layer
		
		return null;
	}


	public Boolean existsName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
