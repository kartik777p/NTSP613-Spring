package com.nit.beans;

public class SampleBean {
	private String name;
	private int age;
	
	public SampleBean() {
	System.out.println("SampleBean::- 0-param Contructor");
	}
    //setters
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "SampleBean [name=" + name + ", age=" + age + "]";
	   }
	}
