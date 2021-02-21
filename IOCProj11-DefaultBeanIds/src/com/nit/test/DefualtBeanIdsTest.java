package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.SampleBean;

public class DefualtBeanIdsTest {

	public static void main(String[] args) {
	  DefaultListableBeanFactory factory=null;
	  XmlBeanDefinitionReader reader=null;
	  SampleBean bean=null;
	  
	  //create IOc Container
	  factory=new DefaultListableBeanFactory();
	  reader=new XmlBeanDefinitionReader(factory);
	  reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
	  //call factry.getBean method
	  bean=factory.getBean("com.nit.beans.SampleBean#0",SampleBean.class);
	  //display data 
	  System.out.println(bean);
	}

}
