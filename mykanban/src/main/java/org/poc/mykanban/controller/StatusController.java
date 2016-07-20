package org.poc.mykanban.controller;

import java.util.List;

import org.poc.mykanban.model.Status;

public interface StatusController {
	
	public Status createStatus(final String name);
	
	public Status editStatus(final String currentName, final String newName);
	
	public boolean removeStatus(final Integer statusId);
	
	public List<Status> addStatus(final Status newStatus);
	
	public List<Status> getStatusesList();

}
