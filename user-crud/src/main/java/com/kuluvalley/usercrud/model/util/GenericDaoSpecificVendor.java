package com.kuluvalley.usercrud.model.util;


/**
 * The specific persistence vendor (JPA or Hibernate, iBatis, etc.) used in the application should provide implementation
 * for basic operations defined in the interface. All DAO implementations should extend this one.
 * 
 * @author David
 *
 * @param <T>
 */
public abstract class GenericDaoSpecificVendor<T> implements GenericDao<T> {


	public boolean exists(String propertyName, Object propertyValue) {
		
		// Get the generic parameter and perform a parameterized query to check if the id exists
		return true;
		
	}


	public T getById(long id) {
		
		T u = null;
		
		// Code to generically retrieve entity by id
		
		return u;
	}

}
