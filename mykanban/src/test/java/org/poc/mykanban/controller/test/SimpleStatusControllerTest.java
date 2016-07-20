package org.poc.mykanban.controller.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.poc.mykanban.controller.SimpleStatusController;
import org.poc.mykanban.controller.StatusController;
import org.poc.mykanban.model.Status;

public class SimpleStatusControllerTest {
	
	private String NAME = "new";
	
	private static StatusController controllerStatus = new SimpleStatusController();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testCreateStatus() {
		controllerStatus.createStatus(NAME);
		assertNotNull(controllerStatus);
	}

	@Test
	public void testAddStatus() {
		Status newStatus = controllerStatus.createStatus(NAME);
		controllerStatus.addStatus(newStatus);
		assertNotNull(controllerStatus.getStatusesList());
		assertTrue(controllerStatus.getStatusesList().get(0).getStatusName().equals(NAME));
		System.out.println("id: "+ controllerStatus.getStatusesList().get(0).getStatusId());
		System.out.println("name: "+ controllerStatus.getStatusesList().get(0).getStatusName());
	}

}
