package com.FinalPracticalExam.Employee.services;

import java.util.List;

import com.FinalPracticalExam.Employee.model.Employee;


public interface EmployeeService {
	public Employee saveRegistred(Employee employee);

	public List<Employee> voterList();
	
	public void deleteByID(int id);
	
	public Employee findByID(int id);
	
	public Employee  updateVoter(Employee employee);

}
