package com.nit.controller;

import com.nit.dto.StudentDTO;
import com.nit.service.StudentOperationService;
import com.nit.vo.StudentVO;

public class MainController {
	private StudentOperationService service;
	//cons injection
	public MainController(StudentOperationService service) {
		System.out.println("MainController::- 1-param Constructor");
		this.service = service;
	}
	//method 
	public String handle(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		//convert vo into DTO
		 dto=new StudentDTO();
		 dto.setSno(Integer.parseInt(vo.getSno()));
		 dto.setSname(vo.getSname());
		 dto.setSadd(vo.getSadd());
		 dto.setM1(Integer.parseInt(vo.getM1()));
		 dto.setM2(Integer.parseInt(vo.getM2()));
		 dto.setM3(Integer.parseInt(vo.getM3()));
      //use service class method
		 result=service.registerStudent(dto);
		 return result;
	}

}
