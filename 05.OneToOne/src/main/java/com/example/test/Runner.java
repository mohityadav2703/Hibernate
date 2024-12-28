package com.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Laptop;
import com.example.entity.Student;
import com.example.repo.StudentRepository;

@Component
public class Runner implements CommandLineRunner{
	
	@Autowired
	private StudentRepository repo;
	
	@Autowired
	private Logger logger = LoggerFactory.getLogger(Student.class);

	@Override
	public void run(String... args) throws Exception {
		
		
		//SAVE DATA
		
//		Student std = new Student();
//		std.setStudentId(12);
//		std.setStudentName("Mohit");
//		std.setAbout("i am a Software Engineer");
//		
//		Laptop lap = new Laptop();
//		lap.setLaptopId(3675);
//		lap.setModelNumber("DL8PQA");
//		lap.setBrand("DELL");
//		
//		lap.setStudent(std);
//		std.setLaptop(lap);
//		
//		Student s=repo.save(std);
//		logger.info("saved student :{}",s.getStudentName());
	
		
		//FETCH DETAILS
		
		Student st=repo.findById(12).get();
		logger.info("Name is :{}", st.getStudentName());
		
		
	}
}
