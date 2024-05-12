package com.mvjr.imstudent.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mvjr.imstudent.entity.StudentSequence;

public interface StudentSequenceRepo extends JpaRepository<StudentSequence, Long>{
	
	@Query(value = "select nextval('student_seq')", nativeQuery = true)
	public Long getNextStudentSequence();
}
