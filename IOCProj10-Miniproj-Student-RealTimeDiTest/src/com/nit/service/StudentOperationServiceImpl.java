package com.nit.service;

import com.nit.bo.StudentBO;
import com.nit.dao.StudentDAO;
import com.nit.dto.StudentDTO;

public class StudentOperationServiceImpl implements StudentOperationService {
	private StudentDAO dao;
	//cons injection(mad)
	public StudentOperationServiceImpl(StudentDAO dao) {
		System.out.println("StudentOperationServiceImpl::- 1-param Constructor");
		this.dao = dao;
	}
	
	@Override
	public String registerStudent(StudentDTO dto) throws Exception {
		int total=0;
		String result=null;
		float avg=0.0f;
		StudentBO bo=null;
		int count=0;
		//get input  from DTO class and perform b logic
		//calc total marks
		total=dto.getM1()+dto.getM2()+dto.getM3();
		//calc avg marks
		avg=total/3;
		// get result
		if(dto.getM1()<35 ||dto.getM2()<35 || dto.getM3()<35)
			result= "fail";
		else
			result="pass";
		//prepare Bo class obj having info (persistable data)
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		//call/use dao class
		count=dao.insert(bo);
		if(count==0)
			return "Student Registrations Failed";
		else
			return"student Registration succeded having total::-"+total+" Avg::-"+avg+" Result::-"+result;
	}
	
}
