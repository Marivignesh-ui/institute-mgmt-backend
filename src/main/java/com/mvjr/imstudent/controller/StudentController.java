package com.mvjr.imstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvjr.imstudent.domain.RegisterStudentRequest;
import com.mvjr.imstudent.entity.Student;
import com.mvjr.imstudent.service.StudentService;

@RestController("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping(path = "/addstudent", produces = "application/json")
	public ResponseEntity<Student> addNewStudent(@RequestBody Student studentRequest) {
		Student studentResponse =  studentService.addStudent(studentRequest);
		return new ResponseEntity<Student>(studentResponse, HttpStatus.CREATED);
	}
	

}
