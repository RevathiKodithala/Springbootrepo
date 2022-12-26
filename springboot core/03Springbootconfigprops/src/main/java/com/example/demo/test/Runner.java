package com.example.demo.test;
  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.bean.EmailService;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private EmailService service;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(service);
	}
}

