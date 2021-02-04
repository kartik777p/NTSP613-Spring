package com.nit.comps;

public class Test {
	private int a;
	private int b;
	
	//static block
	static {
		System.out.println("Class Test is Loaded ::-");
	}
	// constuctor(no param)
	public Test() {
		System.out.println("Test::- 0-param Contructor");
	}
	//contructor(2 param)
	public Test(int a, int b) {
		System.out.println("Test::- 2-param Contructor");
		this.a = a;
		this.b = b;
	}
	//toString
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
	

}
