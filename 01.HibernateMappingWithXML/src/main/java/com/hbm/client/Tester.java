package com.hbm.client;

import com.hbm.dao.StudentDAO;
import com.hbm.dao.StudentDAOImpl;
import com.hbm.entity.Student;

public class Tester {
	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAOImpl();
		
		/*
		 * creating Student object
	    */
		Student student = new Student();
		student.setStdId(1001);
		student.setSname("Mohit");
		student.setGender("Male");
		student.setMarks(500);
		dao.saveStudent(student);
		
		/* 
		 Student stud = dao.loadStudent(1001);
		 System.out.println(stud); 
		*/
		
		/*
		Student s = dao.updateStudent(1001, 101);
		System.out.println(s);
		*/
		
	  //dao.deleteStudent(101);
	}

}
