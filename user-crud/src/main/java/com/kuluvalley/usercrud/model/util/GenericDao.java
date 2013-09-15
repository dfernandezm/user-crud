package com.kuluvalley.usercrud.model.util;

/**
 * Generic interface for DAOs which should be extended by the interfaces of domain-specific DAOs in order to avoid repetition of common operations
 * 
 * The interface is paremeterized with a domain-specific type (T), but it can take other parameters such as primary key type.
 * 
 * @author David
 *
 * @param <T>
 */
public interface GenericDao<T> {

	// example of generic operation
	public boolean exists(String propertyName, Object value);
	/* instead of long, it could be anothe parameter of the class */
	public T getById(long id);
}
