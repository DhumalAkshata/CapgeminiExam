package com.Final.PracticalExam;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Final.PracticalExam.dao.StudentRepository;
import com.Final.PracticalExam.entity.Student;



@SpringBootApplication
public class PracticalExamApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PracticalExamApplication.class, args);

		StudentRepository repo = context.getBean(StudentRepository.class);
		
		Student std = new Student();
		std.setId(1);
		std.setName("Akshata");
		std.setAge(21);
		std.setGrade("A");
		repo.save(std);
	
	//save
	System.out.println("****************************************");
	Student std1 = new Student();
	std.setId(2);
	std.setName("Akanksha");
	std.setAge(55);
	std.setGrade("A");
	repo.save(std1);
	
	Student std2 = new Student();
	std2.setId(3);
	std2.setName("Shubhangi");
	std2.setAge(23);
	std.setGrade("A");
	repo.save(std2);
	
	Student std3 = new Student();
	std3.setId(4);
	std3.setName("Sneha");
	std3.setAge(29);
	std3.setGrade("A");
	repo.save(std3);
	
	List<Student> students = new ArrayList<>();
	students.add(std1);
	students.add(std2);
	students.add(std3);
	
	repo.saveAll(students);
	
	//get
	Optional<Student> op = repo.findById(1) ;
	Student student = op.get();
	System.out.println(student);
	
	//update
	Optional<Student> op1 = repo.findById(1) ;
	Student student1 = op.get();
	student1.setName("Anuja");
	repo.save(student1);
	System.out.println(student1);
	
	//delete
	repo.deleteById(1);
	
	Iterable<Student> findAll = repo.findAll();
	Iterator<Student> iterator = findAll.iterator();
	while(iterator.hasNext()) {
		Student stde = iterator.next();
		System.out.println(stde.getName());
	}
	
	}

	

}
