package com.studentmanagment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagment.dao.StudentEntity;
import com.studentmanagment.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public StudentEntity registerStudent(StudentEntity reg) {
		StudentEntity save= studentRepo.save(reg);
		return save;
	}

	public String deleteStudent(int studentRollno) {
		studentRepo.deleteRollno((long) studentRollno);
		return "";
	}

}
