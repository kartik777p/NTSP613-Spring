package com.nit.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.controller.MainController;
import com.nit.vo.StudentVO;

public class Student_RealTimeDi_Test {

	public static void main(String[] args) {
		FileSystemResource res=null;
		BeanFactory factory=null;
		Scanner sc=null;
		String sno=null;
		String sname=null;
		String sadd=null;
		String m1=null;
		String m2=null;
		String m3=null;
		 StudentVO vo=null;
		 MainController controller=null;
		 String result=null;
		//locate and load xml file
		res=new FileSystemResource("src/com/nit/cfgs/applicationContext.xml");
		//create container
          factory=new XmlBeanFactory(res);
          //read values from enduser
          sc=new Scanner(System.in);
        System.out.println("Enter Student no::- ");  
        sno=sc.nextLine();
        System.out.println("Enter Student name::- ");
        sname=sc.nextLine();
        System.out.println("Enter student Adress::- ");
        sadd=sc.nextLine();
        System.out.println("Enter m1 subject Mark::- ");
        m1=sc.nextLine();
        System.out.println("Enter m2 subject Mark::- ");
        m2=sc.nextLine();
        System.out.println("Enter m3 subject Mark::- ");
        m3=sc.nextLine();
        //create VO class obj  having this data
        vo=new StudentVO();
        //set data to vo class obj
       vo.setSno(sno);
       vo.setSname(sname);
       vo.setSadd(sadd);
       vo.setM1(m1);
       vo.setM2(m2);
       vo.setM3(m3);
       //get controller class obj
      controller=factory.getBean("studController",MainController.class);
      //call Controller class method VO class as args
      try {
        result=controller.handle(vo);
        System.out.println(result);
      }catch(ClassNotFoundException cnf) {
    	  cnf.printStackTrace();
      }catch(Exception e) {
    	  e.printStackTrace();
      }
	}//mthod
}//class
