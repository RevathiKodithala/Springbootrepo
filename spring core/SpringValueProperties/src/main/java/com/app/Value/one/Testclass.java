package com.app.Value.one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(DbConfig.class);
		ThirdClass db=ac.getBean("tobj",ThirdClass.class);
		System.out.println(db);
		

	}

}
