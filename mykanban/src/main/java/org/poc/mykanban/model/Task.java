package org.poc.mykanban.model;

public interface Task {
	
	public Long getTaskId();
	
	public String getTaskName();
	
	public String getTaskDescription();
	
	public User getAssignee();
	
	public Status getStatus();
	
	public void updateStatus(final Status prevStatus, final Status nextStatus);
	
	public void updateAsignee(final User currAssignee, final User newAsignee);
	

}
