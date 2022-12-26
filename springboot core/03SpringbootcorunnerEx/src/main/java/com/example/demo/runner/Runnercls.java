package com.example.demo.runner;

    import com.example.demo.config.*;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.stereotype.Component;

	@Component
	public class Runnercls implements CommandLineRunner {

		@Autowired
		private ConfigEx service;
		
		public void run(String... args) throws Exception {
			System.out.println(service);
		}
	}

