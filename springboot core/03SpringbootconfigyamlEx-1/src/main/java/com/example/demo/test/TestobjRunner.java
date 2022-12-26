package com.example.demo.test;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.stereotype.Component;

	
import com.example.demo.service.Emailservice1;

	@Component
	public class TestobjRunner implements CommandLineRunner {

		
		@Autowired
		private Emailservice1 service;
		
		public void run(String... args) throws Exception {
			System.out.println(service);
			
		}
		
		
		
	}



