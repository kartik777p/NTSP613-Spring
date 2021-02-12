package com.nit.beans;

public class A {
	private B b;
	//cons
	public A() {
	System.out.println("A:- 0-param contructor");
	}
	//setter
	public void setB(B b) {
		this.b = b;
	}
	//toString
	@Override
	public String toString() {
		//return "A [b=" + b + "]"; //stack overflow
		return "A [b=]";
	
	}
	
	
	

}
