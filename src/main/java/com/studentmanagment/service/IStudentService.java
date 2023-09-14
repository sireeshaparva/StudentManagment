package com.studentmanagment.service;

import com.studentmanagment.dao.StudentEntity;

public interface IStudentService {

	public StudentEntity registerStudent(StudentEntity reg);
	
	public String deleteStudent(int studentRollno);
}
