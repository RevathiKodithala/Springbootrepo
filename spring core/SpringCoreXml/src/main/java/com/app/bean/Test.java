package com.app.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("Config.xml");
	MyDetails ob= ac.getBean("mobj",MyDetails.class);
	System.out.println(ob.getData().getClass().getName());
	System.out.println(ob.getModels().getClass().getName());
	System.out.println(ob.getDesign().getClass().getName());
	System.out.println(ob.getMyInfo());

}
}
