package com.studentmanagment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagment.dao.StudentDao;
import com.studentmanagment.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	public StudentDao registerStudent(StudentDao reg) {
		StudentDao save= studentRepo.save(reg);
		return save;
	}

	public String deleteStudent(int studentRollno) {
		studentRepo.deleteRollno((long) studentRollno);
		return "";
	}

}
