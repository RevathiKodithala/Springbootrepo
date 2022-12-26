package com.app.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Some.class);
         SpringMain sm=ac.getBean("mobj",SpringMain.class);
         System.out.println("FROM MAIN");
         System.out.println(sm);
         ac.close();
	}

}
