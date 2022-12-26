package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix="my.app")

public class Emailservice1 {
	private String host;
	private int port;
	private String username;
	private boolean active;
	private List<String> models;
	private Map<String,String> data;
	private Message mob;


}
