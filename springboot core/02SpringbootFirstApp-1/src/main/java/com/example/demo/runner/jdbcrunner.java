package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(67)
@Component
public class jdbcrunner implements CommandLineRunner{

	
	public void run(String... args) throws Exception {
		System.out.println("FROM JDBC RUNNER");
	}
	
	

}
