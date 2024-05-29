package com.FinalPracticalExam.Employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FinalPracticalExam.Employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
