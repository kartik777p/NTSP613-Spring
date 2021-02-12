package com.nit.beans;

public class B {
	private A a;
	//cons
	public B() {
	System.out.println("B::- 0-param contructor");
	}
	
	public B(A a) {
		System.out.println("B::- 0-param Contructor");
		this.a = a;
	}

	//setter
	public void setA(A a) {
		this.a = a;
	}
	//toString
	@Override
	public String toString() {
		//return "B [a=" + a + "]";
		return "B [a=]";
	}
	
	

}
