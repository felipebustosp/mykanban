package org.poc.mykanban.controller;

import org.poc.mykanban.model.SimpleTaskTest;
import org.poc.mykanban.model.Status;
import org.poc.mykanban.model.Task;
import org.poc.mykanban.model.User;
import org.poc.mykanban.model.impl.BasicTask;

public class SimpleTaskController implements TaskController {
	
	private Task task;
	
	public Task createTask(String taskName, String taskDescription, User asignee, Status initialStatus) {
		task = new BasicTask(taskName, taskDescription, asignee, initialStatus);
		return task;
	}

	public Task assignStatus(Status newStatus) {
		task.updateStatus(task.getStatus(), newStatus);
		return task;
	}

	public Task assignAssignee(User newAsignee) {
		task.updateAsignee(task.getAssignee(), newAsignee);
		return task;
	}

}
