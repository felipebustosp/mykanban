package org.poc.mykanban.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.poc.mykanban.model.SimpleStatusTest;
import org.poc.mykanban.model.Status;

public class SimpleStatusController implements StatusController{

	private Status status;
	
	private static List<Status> statusesList = new ArrayList<Status>();
	
	public Status createStatus(String name) {
		status = new SimpleStatusTest(createNewStatusId(), name);
		return status;
	}

	public Status editStatus(final String currentName, String newName) {
		Status found = findStatusByName(currentName);
		if (found != null){
			found.setStatusName(newName);
		}
		return found;
	}

	public boolean removeStatus(Integer statusId) {
		return statusesList.remove(findStatusById(statusId));
	}

	public List<Status> addStatus(Status newStatus) {
		if (! statusesList.contains(newStatus)){
			statusesList.add(newStatus);
		}
		return statusesList;
	}
	
	// Utils
	
	public List<Status> getStatusesList() {
		return statusesList;
	}

	private Status findStatusByName(final String name){
		Iterator<Status> st = statusesList.iterator();
		while (st.hasNext()){
			Status current = st.next();
			if (current.getStatusName().equals(name)){
				return current;
			}
			current = st.next();
		}
		return null;
	}

	private Status findStatusById(final Integer statusId){
		Iterator<Status> st = statusesList.iterator();
		while (st.hasNext()){
			Status current = st.next();
			if (current.getStatusId().equals(statusId)){
				return current;
			}
			current = st.next();
		}
		return null;
	}
	
	private Integer createNewStatusId(){
		return new Random().nextInt((int)new Date().getTime());
	}
	
}
