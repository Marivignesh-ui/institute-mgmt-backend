package com.mvjr.imstudent.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvjr.imstudent.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
