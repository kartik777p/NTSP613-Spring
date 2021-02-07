package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.beans.SportCar;

public class FactoryMethodTestUsingSpring {

	public static void main(String[] args) {
		BeanFactory factory=null;
		ClassPathResource res=null;
		SportCar car=null;
		 //locate and load xml file
		res=new ClassPathResource("com/nit/cfgs/applicationContext.xml");
		//create Container
		factory=new XmlBeanFactory(res);
		//call getbean method to get obj
		car=factory.getBean("sport", SportCar.class);
		//call B method
		car.drive();
		car.addAssesories();
	}

}
