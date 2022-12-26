package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
//@Order(21)
public class Abcd implements CommandLineRunner{

	public void run(String... args) throws Exception {
		
		System.out.println("FROM ABCD RUNNER");
		
	}
	

}
