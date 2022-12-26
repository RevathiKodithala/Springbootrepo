package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.EmailService;

@Component
public class TestobjRunner implements CommandLineRunner {

	
	@Autowired
	private EmailService service;
	
	public void run(String... args) throws Exception {
		System.out.println(service);
		
	}
	
	
	
}
