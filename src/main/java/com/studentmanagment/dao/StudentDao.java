package com.studentmanagment.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Studentdata")

public class StudentDao {
	@Id 
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="studentName")
	private String studentName;
	
	@Column(name="studentRollno")
	private int studentRollno;
	
	@Column(name="studentEmail")
	private String studentEmail;
	
	@Column(name="studentCourse")
	private String studentCourse;
	
	private String username;
	private String password;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the studentRollno
	 */
	public int getStudentRollno() {
		return studentRollno;
	}

	/**
	 * @param studentRollno the studentRollno to set
	 */
	public void setStudentRollno(int studentRollno) {
		this.studentRollno = studentRollno;
	}

	/**
	 * @return the studentEmail
	 */
	public String getStudentEmail() {
		return studentEmail;
	}

	/**
	 * @param studentEmail the studentEmail to set
	 */
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	/**
	 * @return the studentCourse
	 */
	public String getStudentCourse() {
		return studentCourse;
	}

	/**
	 * @param studentCourse the studentCourse to set
	 */
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	
	
	

}
