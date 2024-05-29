package com.Final.PracticalExam.dao;

import org.springframework.data.repository.CrudRepository;

import com.Final.PracticalExam.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{

}
