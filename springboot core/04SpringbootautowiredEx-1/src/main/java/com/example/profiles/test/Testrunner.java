package com.example.profiles.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.profiles.product.Product;

@Component
public class Testrunner implements CommandLineRunner {
	  
	@Autowired
	private Product pob;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(pob);
	}
	

}
