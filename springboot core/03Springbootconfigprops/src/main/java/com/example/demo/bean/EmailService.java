package com.example.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;


@Data
@Component
@ConfigurationProperties(prefix = "my.app")
public class EmailService {
	

		private String host;
		private int port;
		private String username;
		private boolean active;
		@Override
		public String toString() {
			return "EmailService [host=" + host + ", port=" + port + ", username=" + username + ", active=" + active
					+ "]";
		}
		
	}


