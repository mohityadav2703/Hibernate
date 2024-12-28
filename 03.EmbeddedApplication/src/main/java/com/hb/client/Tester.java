package com.hb.client;

import com.hb.DAO.StudentDAO;
import com.hb.DAO.Impl.StudentDAOImpl;
import com.hb.entity.StudentCompositeKey;
import com.hb.entity.StudentEntity;

public class Tester {
	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAOImpl();
//		StudentCompositeKey compositeKey = new StudentCompositeKey();
//		compositeKey.setRollNo(101);
//		compositeKey.setSection("A");
//		
//		StudentEntity entity = new StudentEntity();
//		entity.setComposite(compositeKey);
//		entity.setName("Mohit");
//		entity.setMarks(500);
//		dao.saveStudent(entity);
		
		
		//Fetch Details
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		compositeKey.setRollNo(101);
		compositeKey.setSection("A");
		
		StudentEntity entity = dao.fetchStudent(compositeKey);
		System.out.println("Name :"+entity.getName()+" Marks :"+entity.getMarks());
		
	}

}
