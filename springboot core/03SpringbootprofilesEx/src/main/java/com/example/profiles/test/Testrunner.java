package com.example.profiles.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.profiles.mydb.Mydbcon;

@Component
@Profile(value="prod")
public class Testrunner implements CommandLineRunner{

	@Autowired
	private Mydbcon obj;
	 
	public void run(String... args) throws Exception {
		System.out.println(obj);
		
		
		
	}
	

}
