package com.managerapplication.manager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.managerapplication.manager.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager,Integer>{

}
