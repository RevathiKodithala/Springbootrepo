package com.example.profiles.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.profiles.mydb.Mydbcon;

@Component
@Profile(value ="prod")
public class TestRunner implements CommandLineRunner {
	  
	@Autowired
	private Mydbcon mobj;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(mobj);

	}

}
