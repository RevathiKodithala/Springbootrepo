package com.app.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
@Component("mobj")
public class SpringMain {
	/*implements InitializingBean,DisposableBean {
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("FROM DESTROY METHOD");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("FROM INIT METHOD");
		
	}*/
	private String Filename;
	private String FileExt;
	
	
	public SpringMain() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	}
	@Override
	public String toString() {
		return "SpringMain [Filename=" + Filename + ", FileExt=" + FileExt + "]";
	}
	public String getFilename() {
		return Filename;
	}
	public void setFilename(String filename) {
		Filename = filename;
		System.out.println("FROM SETTER METHOD");
	}
	public String getFileExt() {
		return FileExt;
	}
	public void setFileExt(String fileExt) {
		FileExt = fileExt;
	}
	@PostConstruct
	public void setup() {
		System.out.println("FROM INIT");
	}
	@PreDestroy
	public void close() {
		System.out.println("FROM DESTROY");
	}
	

}
