package com.app.bean.obj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.mix.Myobj;

public class TestStereo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Myobj.class);
		 //ac.scan("com.app.bean.obj");
		 //ac.refresh();
		 ExcelExport ee=ac.getBean("excelExport",ExcelExport.class);
		 System.out.println(ee);
		 
		

	}

}
