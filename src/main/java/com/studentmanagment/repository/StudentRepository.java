package com.studentmanagment.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentmanagment.dao.StudentDao;

@Repository
public interface StudentRepository extends JpaRepository<StudentDao, Long>{
	
	@Modifying
	@Transactional
	//@Query("delete from StudentDao s where s.StudentRollno:studentRollno")
	@Query(value="delete from studentdata s where s.student_rollno=?1",nativeQuery=true)
	void deleteRollno(long studentRollno);
	
	

}
