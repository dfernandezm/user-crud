package com.kuluvalley.usercrud.util;

/**
 * This class aims at providing mapping between domain classes and UI classes in order to avoid intrusion 
 * of view/UI specific stuff into the domain model. 
 * 
 * One of the most common implementations of object mappers is Dozer Mapper  See {@linktourl http://dozer.sourceforge.net}
 * 
 * @author David
 *
 */
public class ObjectMapper {

	
	public <T> T map(Object origin, Class<T> destination) {
		
		// using reflection (or a implementation of a mapper) copy properties from one object to another
		
		// The best approach would be using an implementation of an existent object mapper
		
		return null;
	}
	
}
