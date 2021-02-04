package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WishMassageGenrator;

public class ContructorTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		FileSystemResource res=null;
		WishMassageGenrator wmg=null;
		
		//locate spring bean xml file
		res=new FileSystemResource("src/com/nit/cfgs/applicationContext.xml");
		//create ioc container
		factory=new XmlBeanFactory(res);
		//get bean class obj
		wmg=(WishMassageGenrator)factory.getBean("wmg");
		//call B method
		System.out.println(wmg.genrateWishMsg("kartik"));

	}

}
