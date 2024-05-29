package com.managerapplication.manager.services;

import java.util.List;
import java.util.Optional;

import com.managerapplication.manager.dao.ManagerRepository;
import com.managerapplication.manager.model.Manager;

public class ManagerServiceImp implements ManagerService{
	private ManagerRepository managerRepo;
	
	public ManagerServiceImp(ManagerRepository managerRepo ) {
		super();
		this.managerRepo = managerRepo;
	}

	@Override
	public Manager saveRegistred(Manager manager) {
		
		return managerRepo.save(manager);
	}

	@Override
	public List<Manager> voterList() {
		
		return null;
	}

	@Override
	public void deleteByID(int id) {
		managerRepo.deleteById(id);
	}

	@Override
	public Manager findByID(int id) {
		Optional<Manager> findByid = managerRepo.findById(id);
		Manager mn = findByid.get();
		return mn;
	}

	@Override
	public Manager updateVoter(Manager manager) {
		// TODO Auto-generated method stub
		return managerRepo.save(manager);
	}

}
