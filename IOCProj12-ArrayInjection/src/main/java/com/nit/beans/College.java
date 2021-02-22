package com.nit.beans;

import java.util.Arrays;
import java.util.Date;

public class College {
	private String studName;
	private int marks[];
	//cons
	public College() {
		System.out.println("College::- 0-param Constuctor ");
	}
	//settters
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	//toString
	@Override
	public String toString() {
		return "College [studName=" + studName + ", marks=" + Arrays.toString(marks) + "]";
	}
}
