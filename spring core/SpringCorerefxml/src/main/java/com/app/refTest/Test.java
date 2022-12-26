package com.app.refTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.ref.refclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("refconfig.xml");
		Object ob=ac.getBean("refobj",refclass.class);
		System.out.println(ob);

	}

}
