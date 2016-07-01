package org.poc.mykanban.model;

public class SimpleUserTest implements User {
	
	private Long userId;
	
	private String userName;
	
	private String userEmail;
	
	private String userDescriprion;

	public Long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserDescription() {
		return userDescriprion;
	}

}
