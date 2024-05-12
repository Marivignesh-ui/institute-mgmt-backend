package com.mvjr.imstudent.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvjr.imstudent.domain.RegisterStudentRequest;
import com.mvjr.imstudent.entity.Student;
import com.mvjr.imstudent.exception.InvalidInputException;
import com.mvjr.imstudent.repo.StudentRepo;
import com.mvjr.imstudent.service.StudentService;
import com.mvjr.imstudent.util.CommonUtil;

import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private CommonUtil util;
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	@Transactional(rollbackOn = Exception.class)
	public Student addStudent(Student student) {
		
		if(StringUtils.isNoneBlank(student.getName(), student.getGender(), student.getClassEnrolled(), student.getPrimaryMobile())) {
			throw new InvalidInputException("Invalid input in Mandatory Fields");
		}
		
		String uniqueId = util.getStudentUniqueId();
		student.setUniqueId(uniqueId);
		Student studentResponse = studentRepo.save(student);
		return studentResponse;
	}
	
	

}
