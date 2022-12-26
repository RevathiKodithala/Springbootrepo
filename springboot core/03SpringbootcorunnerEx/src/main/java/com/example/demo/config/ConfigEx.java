package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Configuration("my.app")
	public class ConfigEx {

		private String host;
		private int port;
		private String username;
		private boolean active;
	}

	


