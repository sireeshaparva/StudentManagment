package com.studentmanagment.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.studentmanagment.dao.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>{
	
	@Modifying
	@Transactional
	//@Query("delete from StudentEntity s where s.StudentRollno:studentRollno")
	@Query(value="delete from studentdata s where s.student_rollno=?1",nativeQuery=true)
	void deleteRollno(long studentRollno);
	
	

}
