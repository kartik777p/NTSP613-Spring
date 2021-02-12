package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.A;

public class CyclicDITest {

	public static void main(String[] args) {
		//create ioc container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		//create beanDefinationreader
	   XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	   //load spring bean xml file
	   reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
	   //get bean class obj
	   A a=factory.getBean("a1",A.class);
	   //print obj  data
	   System.out.println(a);
	}

}
