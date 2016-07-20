package org.poc.mykanban.controller;

import org.poc.mykanban.model.User;

public interface UserController {
	
	public boolean createUser(final String name, final String email, final String description);
	
	public User findUserByName(final String name);
	
	public User editUser(final String name);
	
	public boolean removeUser(final Long userId);
	

}
