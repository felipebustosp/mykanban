package org.poc.mykanban.controller;

import org.poc.mykanban.model.Status;
import org.poc.mykanban.model.Task;
import org.poc.mykanban.model.User;

public interface TaskController {
	
	public Task createTask(final String taskName, final String taskDescription, final User asignee, final Status initialStatus);
	
	public Task assignStatus(final Status newStatus);
	
	public Task assignAssignee(final User newAsignee);

}
