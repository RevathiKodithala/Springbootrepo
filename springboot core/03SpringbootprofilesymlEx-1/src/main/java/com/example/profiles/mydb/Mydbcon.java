package com.example.profiles.mydb;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my.app.db")
public class Mydbcon {
	private String driver;
	private String url;
	private String username;
	private String password;
	private String database;

}
