package com.FinalPracticalExam.Employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO.SEQUENCE)
	private int id;
	@NotBlank(message="Voter name cant be empty")
	@Pattern(regexp="^[a-zA-Z]+$", message="Only letter allowed")
	private String name;
	private String position;
	private String department;
	private int contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", department=" + department
				+ ", contact=" + contact + "]";
	}
	public Employee(int id,
			@NotBlank(message = "Voter name cant be empty") @Pattern(regexp = "^[a-zA-Z]+$", message = "Only letter allowed") String name,
			String position, String department, int contact) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.department = department;
		this.contact = contact;
	}
	public Employee() {
		super();
		
	}

}
