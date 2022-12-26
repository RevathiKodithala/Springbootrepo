package com.bean.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.app.bean.*;
import com.app.bean.config.SpringConfig;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		SpringConfig db = ac.getBean ("dbObj",SpringConfig.class);
		System.out.println(db);
		
	}
}
