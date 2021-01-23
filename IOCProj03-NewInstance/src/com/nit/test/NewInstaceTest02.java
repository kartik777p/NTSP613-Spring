package com.nit.test;

import java.lang.reflect.Constructor;

public class NewInstaceTest02 {

	public static void main(String[] args) throws Exception {
		Class c = null;
		Constructor cons[]=null;
		Object obj=null;
		Object obj1=null;
	
		//load class
		c=Class.forName(args[0]);
		//get declared contructor of loaded class
		cons=c.getDeclaredConstructors();
		//create obj of that class using 0-param contructor
		obj=cons[1].newInstance();
		//display Object data
		System.out.println("Data ::-"+obj);
		System.out.println("-------------------------------------------------------------------------------------------------------\n");
		//create obj of loaded class using 2 param contructor
		obj1=cons[0].newInstance(10,20);
		//Display Object data
		System.out.println("data ::- "+obj1);
		}

}
