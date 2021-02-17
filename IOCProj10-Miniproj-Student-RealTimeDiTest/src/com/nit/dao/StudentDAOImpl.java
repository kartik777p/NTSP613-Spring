package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nit.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	//prepare query here
	private static final String Insert_Student_Record="INSERT INTO STUDENT_LAYAREDAPP_MINIPROJ VALUES(?,?,?,?,?,?)"; 
	private DataSource ds;
	//cons injection(Mad)
	public StudentDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl::-1-param Contructor");
		this.ds = ds;
	}
	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get jdbc conn
		con=ds.getConnection();
		//make query as pre compiled query
		ps=con.prepareStatement(Insert_Student_Record);
		//set values to query param(collect from BO class obj)
		ps.setInt(1,bo.getSno());
		ps.setString(2,bo.getSname());
		ps.setString(3,bo.getSadd());
		ps.setInt(4,bo.getTotal());
		ps.setFloat(5,bo.getAvg());
		ps.setString(6,bo.getResult());
		//execute query
		count=ps.executeUpdate();
		return count;
	}

}
