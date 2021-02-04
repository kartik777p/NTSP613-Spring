package com.nit.test;

import com.nit.comps.Test;

public class NewInstaceTest01 {

	public static void main(String[] args) throws Exception {
		Class c = null;
		Object obj = null;
		Test t1 = null;

		// load given class
		c = Class.forName(args[0]);
		// create obj of that class
		obj = c.newInstance();
		// convert obj to its type
		t1 = (Test) obj;
		// data of that obj
		System.out.println("Data ::-" +t1);

	}

}
