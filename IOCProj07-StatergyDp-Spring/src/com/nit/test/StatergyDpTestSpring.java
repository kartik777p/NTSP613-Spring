package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.beans.Vehical;

public class StatergyDpTestSpring {

	public static void main(String[] args) {
		ClassPathResource res=null;
		BeanFactory factory=null;
		Vehical vehical=null;
		//locate and load xml file from the classpath/buildpath
		res=new ClassPathResource("com/nit/cfgs/applicationContext.xml");
		//create ioc container
		factory=new XmlBeanFactory(res);
		//call get bean method to get target class obj
		vehical=factory.getBean("vehical",Vehical.class);
		//call B.logic method
		vehical.move("akola","Hyd");	
		}//main
}//class
