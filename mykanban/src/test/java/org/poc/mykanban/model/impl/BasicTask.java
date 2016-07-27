package org.poc.mykanban.model.impl;

import org.poc.mykanban.model.Status;
import org.poc.mykanban.model.Task;
import org.poc.mykanban.model.User;

public class BasicTask implements Task {

	private Long taskId;
	private String taskName;
	private String taskDescription;
	private User asignee;
	private Status status; 
	
	public Long getTaskId() {
		return taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public User getAssignee() {
		return asignee;
	}

	public Status getStatus() {
		return status;
	}
	
	public User getAsignee() {
		return asignee;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public void setAsignee(User asignee) {
		this.asignee = asignee;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
// Basic Constructor
	public BasicTask(final String taskName, final String taskDescription, final User asignee, final Status status) {
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.asignee = asignee;
		this.status = status;
	}

	public void updateStatus(Status prevStatus, Status nextStatus) {
		if (prevStatus != nextStatus){
			this.status = nextStatus;
		}
	}

	public void updateAsignee(User currAssignee, User newAsignee) {
		if (currAssignee != newAsignee){
			this.asignee = newAsignee;
		}
		
	}

}
