package com.studentmanagment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagment.dao.StudentDao;
import com.studentmanagment.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/test")
	public String getTest() {
		return "test";
		
	}
	@PostMapping("/register")
	public StudentDao registerStudent(@RequestBody StudentDao save) {
		return studentService.registerStudent(save);
		
	}
	
	@DeleteMapping("/delete/{studentRollno}")
	public String deleteStudent(@PathVariable int studentRollno) {
		return studentService.deleteStudent(studentRollno);
		
	}
	

}
