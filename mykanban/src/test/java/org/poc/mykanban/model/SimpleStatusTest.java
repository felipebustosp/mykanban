package org.poc.mykanban.model;

public class SimpleStatusTest implements Status {
	
	private Integer statusId;
	
	private String statusName;

	// Interface implementation
	public Integer getStatusId() {
		return statusId;
	}

	public String getStatusName() {
		return statusName;
	}
	
	//Constructor
	public SimpleStatusTest(final Integer statusId, final String statusName) {
		this.statusId = statusId;
		this.statusName = statusName;
	}

	public void setStatusName(final String name) {
		this.statusName = name;
	}
	
}
