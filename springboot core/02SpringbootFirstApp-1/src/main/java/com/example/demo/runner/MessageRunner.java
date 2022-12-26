package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(100)
@Component
public class MessageRunner implements CommandLineRunner
{
	public void run(String... args) throws Exception {
		System.out.println("FROM KLM RUNNER");
	}
}
