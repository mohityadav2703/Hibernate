package com.example.test;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Address;
import com.example.entity.Student;
import com.example.repo.StudentRepository;

@Component
public class Runner implements CommandLineRunner{
	
	@Autowired
	private StudentRepository repo;

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
	

		Student std = new Student();
		std.setStudentId(01);
		std.setStudentName("ABC");
		std.setAbout("I Love Cooking ");
		
		Address a1 = new Address();
		a1.setAddressId(123);
		a1.setStreet("21/50");
		a1.setCity("Patna");
		a1.setCountry("INDIA");
		a1.setStudent(std);
		
		
		Address a2 = new Address();
		a2.setAddressId(124);
		a2.setStreet("22/50");
		a2.setCity("Delhi");
		a2.setCountry("INDIA");
		a2.setStudent(std);
		
		List<Address> addressList = new ArrayList<>();
		addressList.add(a1);
		addressList.add(a2);
		
		std.setList(addressList);
		repo.save(std);
	}
}
