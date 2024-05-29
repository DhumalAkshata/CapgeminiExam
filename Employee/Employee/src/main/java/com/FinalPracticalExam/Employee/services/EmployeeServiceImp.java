package com.FinalPracticalExam.Employee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.FinalPracticalExam.Employee.dao.EmployeeRepository;
import com.FinalPracticalExam.Employee.model.Employee;



public class EmployeeServiceImp implements EmployeeService {
	private EmployeeRepository empRepo;
	
	@Autowired
	public EmployeeServiceImp(EmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}


	@Override
	public Employee saveRegistred(Employee employee) {
		
		return empRepo.save(employee);

	}

	@Override
	public List<Employee> voterList() {
		List<Employee> findAll= empRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteByID(int id) {
		empRepo.deleteById(id);
		
	}

	@Override
	public Employee findByID(int id) {
		Optional<Employee> findByid=empRepo.findById(id);
		Employee em=findByid.get();
		return em;
	}

	@Override
	public Employee updateVoter(Employee employee) {
		// TODO Auto-generated method stub
		return empRepo.save(employee);
	}

}
