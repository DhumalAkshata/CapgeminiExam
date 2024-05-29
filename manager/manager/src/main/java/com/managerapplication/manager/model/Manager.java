package com.managerapplication.manager.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Manager {
	@Id
	private int id;
	private String title;
	private String desciption;
	private Date dueDate;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", title=" + title + ", desciption=" + desciption + ", dueDate=" + dueDate
				+ ", status=" + status + "]";
	}
	public Manager(int id, String title, String desciption, Date dueDate, String status) {
		super();
		this.id = id;
		this.title = title;
		this.desciption = desciption;
		this.dueDate = dueDate;
		this.status = status;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

}
