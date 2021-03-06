package org.poc.mykanban.model;

public class SimpleTaskTest implements Task {
	
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
