package com.managerapplication.manager.services;

import java.util.List;


import com.managerapplication.manager.model.Manager;

public interface ManagerService {
	public Manager saveRegistred(Manager manager);

	public List<Manager> voterList();
	
	public void deleteByID(int id);
	
	public Manager findByID(int id);
	
	public Manager  updateVoter(Manager Manager);

}
