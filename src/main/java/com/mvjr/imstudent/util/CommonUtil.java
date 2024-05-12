package com.mvjr.imstudent.util;

import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mvjr.imstudent.constant.CommonConstants;
import com.mvjr.imstudent.repo.StudentSequenceRepo;

@Component
public class CommonUtil {
	
	@Autowired
	StudentSequenceRepo studentSeqRepo;

	public String getStudentUniqueId() {
		return CommonConstants.ID_PREFIX + RandomStringUtils.randomAlphanumeric(4).toUpperCase() + studentSeqRepo.getNextStudentSequence();
	}
}
